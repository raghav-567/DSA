package DynamicProgramming;

public class L931 {
    public static void main(String[] args) {

    }
    Integer[][] dp ;
    public int minFallingPathSum(int[][] matrix) {
        int ans = Integer.MAX_VALUE;
        int n = matrix.length;
        dp = new Integer[n][n];

        for(int i = 0 ; i < matrix.length ; i++){
            ans = Math.min(ans, solve(matrix,0,i));
        }
        return ans;
    }
    public int solve(int[][] matrix, int row, int col){
        if(col == matrix.length || col < 0) return Integer.MAX_VALUE;
        if(row == matrix.length) return 0;
        if(dp[row][col] != null) return dp[row][col];
        return dp[row][col] = matrix[row][col] + Math.min(solve(matrix,row+1,col-1),Math.min(solve(matrix,row+1,col),solve(matrix,row+1,col+1)));
    }
}
