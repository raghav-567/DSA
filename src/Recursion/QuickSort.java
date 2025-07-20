package Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1,4,2,55,98,2,67,392};
        int n = arr.length - 1;
        Quicksort(arr,0,n);
        System.out.println(Arrays.toString(arr));
    }

    private static void Quicksort(int[] arr ,int left,int right) {
        if(left>=right){
            return;
        }
        int pivotIndex = left + (right - left) / 2;


        int partionIndex = partition(arr,left,right,pivotIndex);
        Quicksort(arr,left,partionIndex-1);
        Quicksort(arr,partionIndex,right);


    }

    private static int partition(int[] arr, int left, int right, int pivotIndex) {
        int pivot = arr[pivotIndex];
        while (left <= right) {
            // Move left index until we find an element >= pivot
            while (arr[left] < pivot) left++;
            // Move right index until we find an element <= pivot
            while (arr[right] > pivot) right--;
            if(left<=right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }


        }
        return left;

    }

}
