package DynamicProgramming;

public class L70 {
    public static void main(String[] args) {

    }
    int[] dp;
    public int climbStairs(int n) {
        dp = new int[n+1];
        for(int i = 0 ; i < n ; i++){
            dp[i] = -1;
        }
        return solve(n,0);
    }
    public int solve(int n , int idx){
        if(idx == n){
            return 1;
        }

        if(idx > n){
            return 0;
        }

        if(dp[idx] != -1){
            return dp[idx];
        }

        return dp[idx] = solve(n, idx + 1) + solve(n, idx + 2);
    }
}
