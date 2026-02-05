package javacollectionsstreams.regexandjunit.junit;

public class StringUtilsSingle {

    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(reverse(str));
    }

    public String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        StringUtilsSingle su = new StringUtilsSingle();

        System.out.println("Reverse Test: " + su.reverse("java").equals("avaj"));
        System.out.println("Palindrome Test: " + su.isPalindrome("madam"));
        System.out.println("Uppercase Test: " + su.toUpperCase("hello").equals("HELLO"));
    }
}
