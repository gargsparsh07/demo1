package javacollectionsstreams.regexandjunit.junit;

public class PasswordValidatorSingle {

    public boolean isValid(String pwd) {
        return pwd.matches("(?=.*[A-Z])(?=.*\\d).{8,}");
    }

    public static void main(String[] args) {
        PasswordValidatorSingle pv = new PasswordValidatorSingle();

        System.out.println("Valid Test: " + pv.isValid("Test1234"));
        System.out.println("Invalid Test: " + !pv.isValid("test"));
    }
}
