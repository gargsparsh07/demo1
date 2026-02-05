package javacollectionsstreams.regexandjunit.junit;

public class UserRegistrationSingle {

    public void registerUser(String u, String e, String p) {
        if (u.isEmpty() || !e.contains("@") || p.length() < 6)
            throw new IllegalArgumentException("Invalid Input");
    }

    public static void main(String[] args) {
        UserRegistrationSingle ur = new UserRegistrationSingle();

        try {
            ur.registerUser("john", "john@mail.com", "secret1");
            System.out.println("Registration Test: true");
        } catch (Exception e) {
            System.out.println("Registration Test: false");
        }
    }
}
