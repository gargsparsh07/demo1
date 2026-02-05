package javacollectionsstreams.regexandjunit.junit;

public class CalculatorBasicSingle {

    // Calculator methods
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    // Manual testing inside main()
    public static void main(String[] args) {
        CalculatorBasicSingle calc = new CalculatorBasicSingle();

        System.out.println("Add Test: " + (calc.add(10, 5) == 15));
        System.out.println("Subtract Test: " + (calc.subtract(10, 5) == 5));
        System.out.println("Multiply Test: " + (calc.multiply(10, 5) == 50));
        System.out.println("Divide Test: " + (calc.divide(10, 5) == 2));

        // Exception test
        try {
            calc.divide(10, 0);
            System.out.println("Divide by Zero Test: false");
        } catch (ArithmeticException e) {
            System.out.println("Divide by Zero Test: true");
        }
    }
}
