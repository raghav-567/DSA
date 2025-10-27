package Leetcode_contest;

import java.util.Arrays;

public class Weekly473_1 {
    public static void main(String[] args) {

    }
    public long maxAlternatingSum(int[] nums) {
        int N = nums.length;
        long[] squares = new long[N];

        for (int i = 0; i < N; i++) {
            squares[i] = (long)nums[i] * nums[i];
        }
        Arrays.sort(squares);

        long maxSum = 0;
        int N_pos = (N + 1) / 2;
        int N_neg = N / 2;
        for (int i = 0; i < N_pos; i++) {
            maxSum += squares[N - 1 - i];
        }
        for (int i = 0; i < N_neg; i++) {
            maxSum -= squares[i];
        }

        return maxSum;
    }

}
