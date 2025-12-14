package Leetcode_contest;

import java.util.Arrays;

public class Weekly480_1 {
    public static void main(String[] args) {

    }
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);

        int smallSum = 0;
        int largeSum = 0;

        for (int i = 0; i < k; i++) {
            smallSum += nums[i];
            largeSum += nums[nums.length - 1 - i];
        }

        return Math.abs(largeSum - smallSum);
    }
}
