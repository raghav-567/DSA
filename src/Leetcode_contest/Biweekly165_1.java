package Leetcode_contest;

import java.util.HashSet;

public class Biweekly165_1 {
    public static void main(String[] args) {
        int[] nums = {2,4,1,9,6};
        smallestAbsent(nums);
    }
        public static int smallestAbsent(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            int sum = 0;
            for(int i = 0 ; i < nums.length ; i++){
                sum += nums[i];
                set.add(nums[i]);
            }
            double avg = (double) sum / nums.length;
            int a = Math.max(1, (int) Math.floor(avg) + 1);

            while(true){
                if(!set.contains(a) && a > avg){
                    return a;
                }
                a++;
            }
        }
    }


