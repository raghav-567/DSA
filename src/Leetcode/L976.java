package Leetcode;
import java.util.*;


public class L976 {
    public static void main(String[] args) {

    }
    public int largestPerimeter(int[] nums) {
        int n = nums.length-1;
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        for(int i = 2 ; i <= n ; i++){
            if(nums[i] < nums[i-1] + nums[i-2]){
                set.add(nums[i] + nums[i-1] + nums[i-2]);
            }
        }
        int max = 0;
        for(int j : set){
            if(j>max){
                max = j;
            }
        }
        return max;
    }
}
