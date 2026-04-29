package DynamicProgramming;
import java.util.Arrays;

public class L1235 {
    public static void main(String[] args) {

    }
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        int[] dp = new int[n];
        for(int i = 0 ; i < n ; i++){
            dp[i] = -1;
        }
        int[][] arr = new int[n][3];
        for(int i = 0 ; i < n ; i++){
            arr[i][0] = startTime[i];
            arr[i][1] = endTime[i];
            arr[i][2] = profit[i];
        }
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        return solve(arr,startTime,0,dp);

    }
    public int solve(int[][] arr , int[] startTime , int i , int[] dp){
        if(i >= arr.length){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int next = getNext(arr,arr[i][1]);
        int take = arr[i][2] + solve(arr,startTime,next,dp);
        int not_take = solve(arr,startTime,i+1,dp);

        dp[i] = Math.max(take,not_take);
        return Math.max(take,not_take);
    }
    public int getNext(int[][] arr, int end) {
        int l = 0, r = arr.length;

        while (l < r) {
            int mid = (l + r) / 2;
            if (arr[mid][0] < end) l = mid + 1;
            else r = mid;
        }

        return l;
    }
}
