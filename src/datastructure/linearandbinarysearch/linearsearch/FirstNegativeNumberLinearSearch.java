package datastructure.linearandbinarysearch.linearsearch;

public class FirstNegativeNumberLinearSearch {

    public static void main(String[] args) {
        int[] arr = {5, 2, -4, 7};

        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                index = i;
                break;
            }
        }

        System.out.println("Index: " + index);
    }
}
