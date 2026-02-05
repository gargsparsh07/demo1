package javacollectionsstreams.java8features.level2;

import java.util.*;
import java.util.stream.*;

class Transaction {
    int id;
    String policy;
    double amount;
    boolean fraud;

    Transaction(int id,String policy,double amount,boolean fraud){
        this.id=id;this.policy=policy;this.amount=amount;this.fraud=fraud;
    }
}

public class FraudDetection {

    public static void main(String[] args) {

        List<Transaction> tx = Arrays.asList(
                new Transaction(1,"P1",20000,true),
                new Transaction(2,"P1",15000,true),
                new Transaction(3,"P1",18000,true),
                new Transaction(4,"P2",5000,false),
                new Transaction(5,"P2",60000,true)
        );

        Map<String, DoubleSummaryStatistics> fraudStats =
                tx.stream()
                        .filter(t->t.fraud && t.amount>10000)
                        .collect(Collectors.groupingBy(
                                t->t.policy,
                                Collectors.summarizingDouble(t->t.amount)
                        ));

        fraudStats.forEach((policy,stat)->{
            if(stat.getCount()>5 || stat.getSum()>50000)
                System.out.println("ALERT: "+policy+" Fraud Amount="+stat.getSum()+" Count="+stat.getCount());
        });
    }
}
