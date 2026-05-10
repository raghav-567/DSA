package Leetcode_contest;

public class Weekly501_1 {
    public static void main(String[] args) {

    }
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2*n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = nums[i];
        }
        int j = n;
        for(int i = n-1 ; i >= 0 ; i--){
            arr[j] = nums[i];
            j++;
        }
        return arr ;
    }
}
