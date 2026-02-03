package javacollectionsstreams.collections;

import java.time.LocalDate;
import java.util.*;

class Policy {
    int number;
    String name, type;
    LocalDate expiry;

    Policy(int n, String name, String type, LocalDate e) {
        number=n; this.name=name; this.type=type; expiry=e;
    }
}

public class InsurancePolicySetSystem {
    public static void main(String[] args) {

        Set<Policy> hashSet = new HashSet<>();
        Set<Policy> linkedSet = new LinkedHashSet<>();
        Set<Policy> treeSet = new TreeSet<>(
                Comparator.comparing(p -> p.expiry));

        Policy p1 = new Policy(1,"Amit","Health",LocalDate.now().plusDays(20));
        Policy p2 = new Policy(2,"Riya","Auto",LocalDate.now().plusDays(40));

        hashSet.add(p1); linkedSet.add(p1); treeSet.add(p1);
        hashSet.add(p2); linkedSet.add(p2); treeSet.add(p2);

        treeSet.forEach(p -> System.out.println(p.number));
    }
}
