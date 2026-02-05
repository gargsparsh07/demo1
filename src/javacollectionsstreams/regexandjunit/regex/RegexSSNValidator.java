package javacollectionsstreams.regexandjunit.regex;

public class RegexSSNValidator {

    public static boolean isValid(String ssn) {
        return ssn.matches("\\b\\d{3}-\\d{2}-\\d{4}\\b");
    }

    public static void main(String[] args) {
        System.out.println(isValid("123-45-6789")); // true
        System.out.println(isValid("123456789"));   // false
    }
}
