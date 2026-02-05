package javacollectionsstreams.java8features.level1;

import java.util.*;

public class OptionalMaxValue {

    public static Optional<Integer> findMax(List<Integer> list) {
        return list.stream().max(Integer::compareTo);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 40, 20, 50);

        Optional<Integer> max = findMax(numbers);

        max.ifPresentOrElse(
                value -> System.out.println("Max value: " + value),
                () -> System.out.println("List is empty")
        );
    }
}
