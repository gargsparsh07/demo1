package javacollectionsstreams.java8features.level1;

import java.util.*;

public class SumOfSquaresEvenNumbers {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        int result = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println("Sum of squares: " + result);
    }
}
