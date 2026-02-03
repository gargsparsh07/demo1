package javacollectionsstreams.collections;

import java.util.*;

public class ListInterfaceProblems {

    // Reverse List (ArrayList / LinkedList)
    static <T> void reverseList(List<T> list) {
        int i = 0, j = list.size() - 1;
        while (i < j) {
            T temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++; j--;
        }
    }

    // Frequency of elements
    static Map<String, Integer> frequency(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        return map;
    }

    // Rotate list
    static <T> void rotate(List<T> list, int k) {
        k = k % list.size();
        List<T> temp = new ArrayList<>(list.subList(k, list.size()));
        temp.addAll(list.subList(0, k));
        list.clear();
        list.addAll(temp);
    }

    // Remove duplicates preserving order
    static <T> List<T> removeDuplicates(List<T> list) {
        Set<T> seen = new LinkedHashSet<>(list);
        return new ArrayList<>(seen);
    }

    // Nth from end (LinkedList)
    static <T> T nthFromEnd(LinkedList<T> list, int n) {
        Iterator<T> fast = list.iterator();
        Iterator<T> slow = list.iterator();

        for (int i = 0; i < n; i++) fast.next();
        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }
        return slow.next();
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5));
        reverseList(list);
        System.out.println(list);

        System.out.println(frequency(List.of("apple","banana","apple","orange")));

        rotate(list, 2);
        System.out.println(list);

        System.out.println(removeDuplicates(List.of(3,1,2,2,3,4)));

        LinkedList<String> ll = new LinkedList<>(List.of("A","B","C","D","E"));
        System.out.println(nthFromEnd(ll, 2));
    }
}
