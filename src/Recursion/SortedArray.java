package Recursion;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,9,8,9};
        System.out.println(Sorted(arr,0));
    }

    private static boolean Sorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if(arr[i] <= arr[i+1] ) {
            return Sorted(arr, i+1);

        }
        return false;
    }
}
