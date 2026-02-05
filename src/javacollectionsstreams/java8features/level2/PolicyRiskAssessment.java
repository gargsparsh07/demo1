package javacollectionsstreams.java8features.level2;

import java.util.*;
import java.util.stream.*;

class PolicyHolder {
    int id, age;
    String name, type;
    double premium;
    PolicyHolder(int id,String name,int age,String type,double premium){
        this.id=id;this.name=name;this.age=age;this.type=type;this.premium=premium;
    }
}

class RiskAssessment {
    int id; String name; double score;
    RiskAssessment(int id,String name,double score){this.id=id;this.name=name;this.score=score;}
}

public class PolicyRiskAssessment {

    public static void main(String[] args) {

        List<PolicyHolder> list = Arrays.asList(
                new PolicyHolder(1,"John",65,"Life",40000),
                new PolicyHolder(2,"Alice",70,"Life",30000),
                new PolicyHolder(3,"Bob",45,"Health",20000)
        );

        Map<String,List<RiskAssessment>> categorized =
                list.stream()
                        .filter(p->p.type.equals("Life") && p.age>60)
                        .map(p->new RiskAssessment(p.id,p.name,p.premium/(double)p.age))
                        .sorted((a,b)->Double.compare(b.score,a.score))
                        .collect(Collectors.groupingBy(r-> r.score>0.5 ? "High Risk":"Low Risk"));

        System.out.println(categorized);
    }
}
