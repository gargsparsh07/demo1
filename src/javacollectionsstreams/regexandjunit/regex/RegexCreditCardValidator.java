package javacollectionsstreams.regexandjunit.regex;

public class RegexCreditCardValidator {

    public static boolean isValid(String card) {
        return card.matches("^4\\d{15}$") || card.matches("^5\\d{15}$");
    }

    public static void main(String[] args) {
        System.out.println(isValid("4123456789012345")); // Visa
        System.out.println(isValid("5123456789012345")); // Master
    }
}
