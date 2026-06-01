package DynamicProgramming;

import java.util.Arrays;

public class L213 {
    public static void main(String[] args) {

    }
    int[] dp;
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 0) return 0;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);

        dp = new int[nums.length];
        Arrays.fill(dp,-1);
        int first_taken = solve(nums,0,nums.length - 1);
        Arrays.fill(dp,-1);
        int first_not_taken = solve(nums,1,nums.length);
        return Math.max(first_taken,first_not_taken);
    }
    public int solve(int[] nums , int idx, int end){
        if(idx >= end){
            return 0;
        }
        if(dp[idx] != -1){
            return dp[idx];
        }
        int pick = nums[idx] + solve(nums,idx + 2,end);
        int not_pick = 0 + solve(nums,idx + 1,end);
        return dp[idx] = Math.max(pick,not_pick);
    }
}
