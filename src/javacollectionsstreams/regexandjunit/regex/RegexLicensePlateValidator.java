package javacollectionsstreams.regexandjunit.regex;

public class RegexLicensePlateValidator {

    public static boolean isValid(String plate) {
        return plate.matches("^[A-Z]{2}\\d{4}$");
    }

    public static void main(String[] args) {
        System.out.println(isValid("AB1234")); // true
        System.out.println(isValid("A12345")); // false
    }
}
