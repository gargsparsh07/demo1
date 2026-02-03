package javacollectionsstreams.collections;

import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {

        Map<String,Integer> cart = new LinkedHashMap<>();
        cart.put("Laptop",50000);
        cart.put("Mouse",500);

        Map<Integer,String> sorted =
                new TreeMap<>(Comparator.naturalOrder());

        cart.forEach((k,v)-> sorted.put(v,k));
        System.out.println(sorted);
    }
}
