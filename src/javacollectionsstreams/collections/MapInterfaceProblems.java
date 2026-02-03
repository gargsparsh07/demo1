package javacollectionsstreams.collections;

import java.util.*;

public class MapInterfaceProblems {

    public static void main(String[] args) {

        String text = "Hello world hello Java";
        Map<String,Integer> freq = new HashMap<>();

        for (String w : text.toLowerCase().split("\\W+"))
            freq.put(w, freq.getOrDefault(w,0)+1);

        System.out.println(freq);

        Map<String,Integer> map = Map.of("A",1,"B",2,"C",1);
        Map<Integer,List<String>> inverted = new HashMap<>();

        map.forEach((k,v) ->
                inverted.computeIfAbsent(v,x->new ArrayList<>()).add(k));

        System.out.println(inverted);

        System.out.println(Collections.max(freq.entrySet(),
                Map.Entry.comparingByValue()).getKey());

        Map<String,Integer> m1 = new HashMap<>(Map.of("A",1,"B",2));
        Map<String,Integer> m2 = Map.of("B",3,"C",4);

        m2.forEach((k,v)-> m1.merge(k,v,Integer::sum));
        System.out.println(m1);
    }
}
