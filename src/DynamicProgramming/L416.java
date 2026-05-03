package DynamicProgramming;
import java.util.Arrays;

public class L416 {
    public static void main(String[] args) {

    }
    int[][] dp = new int[201][20001];
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
        }
        if(sum % 2 != 0){
            return false;
        }
        for (int i = 0; i < 201; i++) {
            Arrays.fill(dp[i], -1);
        }

        int x = sum/2;
        return solve(0,x,nums);

    }
    public boolean solve(int i , int x , int[] nums){
        if(x == 0){
            return true;
        }
        if (i >= nums.length || x < 0) return false;

        if(dp[i][x] != -1){
            return dp[i][x] == 1;
        }
        boolean take = solve(i+1,x-nums[i],nums);

        boolean not_take = solve(i+1,x,nums);

        dp[i][x] = (take || not_take) ? 1 : 0 ;
        return take || not_take;
    }
}
