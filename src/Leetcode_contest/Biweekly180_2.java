package Leetcode_contest;

public class Biweekly180_2 {
    public static void main(String[] args) {

    }
    public int countDigitOccurrences(int[] nums, int digit) {
        int curr = 0;
        int count = 0;
        for(int num : nums){
            while(num > 0){
                curr = num % 10;
                if(curr == digit){
                    count++;
                }
                num /= 10;
            }
        }
        return count;
    }
}
