package javacollectionsstreams.regexandjunit.junit;

public class ExceptionDivideSingle {

    public int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Divide by zero");
        return a / b;
    }

    public static void main(String[] args) {
        ExceptionDivideSingle ed = new ExceptionDivideSingle();

        try {
            ed.divide(10, 0);
            System.out.println("Exception Test: false");
        } catch (ArithmeticException e) {
            System.out.println("Exception Test: true");
        }
    }
}
