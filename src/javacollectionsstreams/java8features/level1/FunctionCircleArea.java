package javacollectionsstreams.java8features.level1;

import java.util.function.Function;

public class FunctionCircleArea {

    public static void main(String[] args) {
        Function<Double, Double> area =
                r -> Math.PI * r * r;

        System.out.println("Area: " + area.apply(5.0));
    }
}
