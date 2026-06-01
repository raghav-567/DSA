package DynamicProgramming;

import java.util.Arrays;

public class L198 {
    public static void main(String[] args) {

    }
    int[] dp;
    public int rob(int[] nums) {
        dp = new int[nums.length + 1];
        Arrays.fill(dp, -1);
        return solve(nums,0);
    }
    public int solve(int[] nums , int idx , int end){
        if(idx >= end){
            return 0;
        }
        if(idx == nums.length -1){
            return nums[idx];
        }
        if(dp[idx] != -1){
            return dp[idx];
        }
        int pick = nums[idx] + solve(nums,idx+2);
        int not_pick = 0 + solve(nums,idx+1);
        return dp[idx] =  Math.max(pick,not_pick);
    }
}

