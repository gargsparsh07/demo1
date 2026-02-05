package javacollectionsstreams.java8features.level1;

import java.util.function.BiFunction;

public class BiFunctionConcatenateStrings {

    public static void main(String[] args) {
        BiFunction<String, String, String> concat =
                (a, b) -> a + " " + b;

        System.out.println(concat.apply("Hello", "World"));
    }
}
