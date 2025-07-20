package Recursion;

import java.util.Arrays;

import static java.io.ObjectInputFilter.merge;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {1,1,4,7,2,1,3,11};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] left,int[] right){
       int  i = 0 ;
        int j = 0 ;
        int k = 0;
        int[] nums = new int[left.length+right.length];
        while(i< left.length && j < right.length) {
            if (left[i] > right[j]) {
                nums[k++] = right[j];
                j++;
            } else {
                nums[k++] = left[i];
                i++;
            }
        }
        while(i < left.length){
            nums[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length) {
            nums[k] = right[j];
            j++;
            k++;
        }
        return nums;

    }

}
