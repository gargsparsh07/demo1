package javacollectionsstreams.regexandjunit.junit;

public class TemperatureConverterSingle {

    public double cToF(double c) {
        return (c * 9 / 5) + 32;
    }

    public double fToC(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        TemperatureConverterSingle tc = new TemperatureConverterSingle();

        System.out.println("C to F Test: " + (tc.cToF(0) == 32));
        System.out.println("F to C Test: " + (tc.fToC(32) == 0));
    }
}
