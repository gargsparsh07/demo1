package javacollectionsstreams.java8features.level2;

import java.util.*;
import java.util.stream.*;

class Claim {
    int claimId;
    String policyNumber,status;
    double amount;

    Claim(int id,String policy,double amt,String status){
        claimId=id;policyNumber=policy;amount=amt;this.status=status;
    }
}

public class ClaimsAnalysis {

    public static void main(String[] args) {

        List<Claim> claims = Arrays.asList(
                new Claim(1,"P1",7000,"Approved"),
                new Claim(2,"P1",9000,"Approved"),
                new Claim(3,"P2",3000,"Rejected"),
                new Claim(4,"P2",12000,"Approved"),
                new Claim(5,"P3",20000,"Approved")
        );

        Map<String, DoubleSummaryStatistics> stats =
                claims.stream()
                        .filter(c->c.status.equals("Approved") && c.amount>5000)
                        .collect(Collectors.groupingBy(
                                c->c.policyNumber,
                                Collectors.summarizingDouble(c->c.amount)
                        ));

        stats.entrySet().stream()
                .sorted((a,b)->Double.compare(b.getValue().getSum(),a.getValue().getSum()))
                .limit(3)
                .forEach(e->System.out.println(e.getKey()+" Total:"+e.getValue().getSum()+" Avg:"+e.getValue().getAverage()));
    }
}
