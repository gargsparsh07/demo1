package javacollectionsstreams.collections;

import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {

        Map<Integer,Integer> accounts = new HashMap<>();
        accounts.put(101,5000);
        accounts.put(102,10000);

        Queue<Integer> withdrawals = new LinkedList<>();
        withdrawals.add(101);

        System.out.println("Processing account: " + withdrawals.poll());
    }
}
