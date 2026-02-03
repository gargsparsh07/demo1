package javacollectionsstreams.collections;

import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyMapSystem {

    // ✅ INNER CLASS (no duplicate conflict now)
    static class Policy {
        int policyNumber;
        String holderName;
        LocalDate expiryDate;
        String coverageType;
        double premium;

        Policy(int policyNumber, String holderName,
               LocalDate expiryDate, String coverageType,
               double premium) {
            this.policyNumber = policyNumber;
            this.holderName = holderName;
            this.expiryDate = expiryDate;
            this.coverageType = coverageType;
            this.premium = premium;
        }

        @Override
        public String toString() {
            return policyNumber + " | " + holderName + " | "
                    + coverageType + " | " + expiryDate + " | " + premium;
        }
    }

    public static void main(String[] args) {

        Map<Integer, Policy> policyMap = new HashMap<>();

        policyMap.put(101, new Policy(
                101, "Amit",
                LocalDate.now().plusDays(20),
                "Health", 5000));

        policyMap.put(102, new Policy(
                102, "Riya",
                LocalDate.now().plusDays(40),
                "Auto", 7000));

        policyMap.put(103, new Policy(
                103, "Amit",
                LocalDate.now().minusDays(5),
                "Home", 9000));

        // 🔹 All policies
        System.out.println("All Policies:");
        policyMap.values().forEach(System.out::println);

        // 🔹 Expiring in next 30 days
        System.out.println("\nPolicies expiring within 30 days:");
        policyMap.values().stream()
                .filter(p -> p.expiryDate.isBefore(LocalDate.now().plusDays(30)))
                .forEach(System.out::println);

        // 🔹 Policies by holder
        System.out.println("\nPolicies for Amit:");
        policyMap.values().stream()
                .filter(p -> p.holderName.equalsIgnoreCase("Amit"))
                .forEach(System.out::println);

        // 🔹 Remove expired policies
        policyMap.values().removeIf(
                p -> p.expiryDate.isBefore(LocalDate.now()));

        System.out.println("\nAfter removing expired policies:");
        policyMap.values().forEach(System.out::println);
    }
}
