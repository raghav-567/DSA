package PrefixSum;

import java.util.HashSet;

public class L1546 {
    public static void main(String[] args) {

    }
    public int maxNonOverlapping(int[] nums, int target) {
        int count = 0 ;
        int prefixSum = 0;
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        int i = 0;
        while(i < nums.length){
            prefixSum += nums[i];
            if(set.contains(prefixSum - target)){
                count += 1;
                prefixSum = 0;
                set.clear();
                set.add(0);
            } else {
                set.add(prefixSum);
            }
            i++;
        }
        return count;
    }
}
