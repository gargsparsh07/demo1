package datastructure.linearandbinarysearch.binarysearch;

public class FirstAndLastOccurrence {

    static int findFirst(int[] arr, int target) {
        int res = -1, l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] == target) {
                res = m;
                r = m - 1;
            } else if (arr[m] < target) l = m + 1;
            else r = m - 1;
        }
        return res;
    }

    static int findLast(int[] arr, int target) {
        int res = -1, l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] == target) {
                res = m;
                l = m + 1;
            } else if (arr[m] < target) l = m + 1;
            else r = m - 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4};
        int target = 2;

        System.out.println("First: " + findFirst(arr, target));
        System.out.println("Last: " + findLast(arr, target));
    }
}
