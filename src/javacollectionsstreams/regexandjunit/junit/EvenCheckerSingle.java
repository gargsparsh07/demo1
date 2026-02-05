package javacollectionsstreams.regexandjunit.junit;

public class EvenCheckerSingle {

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        EvenCheckerSingle ec = new EvenCheckerSingle();
        int[] numbers = {2, 4, 6, 7, 9};

        for (int n : numbers) {
            System.out.println(n + " Even? " + ec.isEven(n));
        }
    }
}
