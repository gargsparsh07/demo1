package javacollectionsstreams.regexandjunit.regex;

public class RegexUsernameValidator {

    public static boolean isValid(String username) {
        return username.matches("^[A-Za-z][A-Za-z0-9_]{4,14}$");
    }

    public static void main(String[] args) {
        System.out.println(isValid("user_123")); // true
        System.out.println(isValid("123user")); // false
        System.out.println(isValid("us"));       // false
    }
}
