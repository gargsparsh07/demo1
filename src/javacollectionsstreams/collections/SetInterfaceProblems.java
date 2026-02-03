package javacollectionsstreams.collections;

import java.util.*;

public class SetInterfaceProblems {

    public static void main(String[] args) {

        Set<Integer> s1 = new HashSet<>(Set.of(1,2,3));
        Set<Integer> s2 = new HashSet<>(Set.of(3,2,1));

        System.out.println(s1.equals(s2)); // equality

        Set<Integer> union = new HashSet<>(s1);
        union.addAll(Set.of(3,4,5));

        Set<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(Set.of(3,4,5));

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);

        Set<Integer> symmetric = new HashSet<>(union);
        symmetric.removeAll(intersection);
        System.out.println("Symmetric Diff: " + symmetric);

        Set<Integer> hs = new HashSet<>(Set.of(5,3,9,1));
        List<Integer> sorted = new ArrayList<>(hs);
        Collections.sort(sorted);
        System.out.println(sorted);

        System.out.println(Set.of(2,3).containsAll(Set.of(2,3))); // subset
    }
}
