package javacollectionsstreams.java8features.level1;

@FunctionalInterface
interface SumOperation {
    int add(int a, int b);
}

public class LambdaSumCalculator {

    public static void main(String[] args) {
        SumOperation sum = (a, b) -> a + b;

        System.out.println("Sum: " + sum.add(10, 20));
    }
}
