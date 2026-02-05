package javacollectionsstreams.java8features.level1;

@FunctionalInterface
interface SquareCalc {
    int square(int x);

    default void printResult(int result) {
        System.out.println("Square result is: " + result);
    }
}

public class SquareCalculatorWithDefault {

    public static void main(String[] args) {
        SquareCalc sc = x -> x * x;

        int result = sc.square(6);
        sc.printResult(result);
    }
}
