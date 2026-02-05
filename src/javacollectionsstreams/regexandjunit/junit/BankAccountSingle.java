package javacollectionsstreams.regexandjunit.junit;

public class BankAccountSingle {

    double balance = 0;

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) return false;
        balance -= amount;
        return true;
    }

    public static void main(String[] args) {
        BankAccountSingle ba = new BankAccountSingle();
        ba.deposit(1000);
        System.out.println("Deposit Test: " + (ba.balance == 1000));
        System.out.println("Withdraw Test: " + ba.withdraw(500));
        System.out.println("Insufficient Test: " + !ba.withdraw(1000));
    }
}
