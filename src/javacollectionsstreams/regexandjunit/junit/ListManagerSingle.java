package javacollectionsstreams.regexandjunit.junit;

import java.util.*;

public class ListManagerSingle {

    public void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    public void removeElement(List<Integer> list, int element) {
        list.remove(Integer.valueOf(element));
    }

    public int getSize(List<Integer> list) {
        return list.size();
    }

    public static void main(String[] args) {
        ListManagerSingle lm = new ListManagerSingle();
        List<Integer> list = new ArrayList<>();

        lm.addElement(list, 10);
        lm.addElement(list, 20);
        System.out.println("Add Test: " + list.contains(10));

        lm.removeElement(list, 10);
        System.out.println("Remove Test: " + !list.contains(10));

        System.out.println("Size Test: " + (lm.getSize(list) == 1));
    }
}
