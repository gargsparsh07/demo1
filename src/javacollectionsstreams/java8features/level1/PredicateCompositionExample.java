package javacollectionsstreams.java8features.level1;

import java.util.*;
import java.util.function.Predicate;

public class PredicateCompositionExample {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("functional", "java", "lambda", "expression", "stream");

        Predicate<String> lengthGreaterThan5 = s -> s.length() > 5;
        Predicate<String> containsSub = s -> s.contains("ion");

        words.stream()
                .filter(lengthGreaterThan5.and(containsSub))
                .forEach(System.out::println);
    }
}
