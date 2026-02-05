package javacollectionsstreams.regexandjunit.regex;

public class RegexIPValidator {

    public static boolean isValid(String ip) {
        return ip.matches(
                "^(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\." +
                        "(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\." +
                        "(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\." +
                        "(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$"
        );
    }

    public static void main(String[] args) {
        System.out.println(isValid("192.168.1.1")); // true
        System.out.println(isValid("256.1.1.1"));   // false
    }
}
