package javacollectionsstreams.regexandjunit.regex;

public class RegexHexColorValidator {

    public static boolean isValid(String color) {
        return color.matches("^#[0-9a-fA-F]{6}$");
    }

    public static void main(String[] args) {
        System.out.println(isValid("#FFA500")); // true
        System.out.println(isValid("#ff4500")); // true
        System.out.println(isValid("#123"));    // false
    }
}
