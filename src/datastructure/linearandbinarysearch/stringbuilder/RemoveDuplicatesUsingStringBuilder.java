package datastructure.linearandbinarysearch.stringbuilder;

import java.util.HashSet;

public class RemoveDuplicatesUsingStringBuilder {

    public static void main(String[] args) {
        String input = "programming";
        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (!set.contains(ch)) {
                set.add(ch);
                result.append(ch);
            }
        }

        System.out.println("String without duplicates: " + result);
    }
}
