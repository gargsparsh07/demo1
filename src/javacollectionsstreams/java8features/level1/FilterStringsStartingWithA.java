package javacollectionsstreams.java8features.level1;

import java.util.*;
import java.util.stream.*;

public class FilterStringsStartingWithA {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Apple", "Banana", "Avocado", "Mango", "Apricot");

        names.stream()
                .filter(s -> s.startsWith("A"))
                .forEach(System.out::println);
    }
}
