package DynamicProgramming;

public class L3654 {
    public static void main(String[] args) {

    }
    public long minArraySum(int[] nums, int k) {
        long[] dp = new long[k];
        Arrays.fill(dp, Long.MAX_VALUE);
        dp[0] = 0;

        long result = 0;

        for (int x : nums) {
            result += x;
            int mod = (int)(result % k);

            if (dp[mod] < result) {
                result = dp[mod];
            } else {
                dp[mod] = result;
            }
        }

        return result;
    }

}
