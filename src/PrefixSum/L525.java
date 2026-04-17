package PrefixSum;

import java.util.HashMap;

public class L525 {
    public static void main(String[] args) {

    }
    public int findMaxLength(int[] nums) {
        int max = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int prefixsum = 0;
        map.put(0, -1);
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                nums[i] = -1;
            }
        }
        for(int i = 0 ; i < nums.length ; i++){
            prefixsum += nums[i];
            if(map.containsKey(prefixsum)){
                int m = map.get(prefixsum);
                max = Math.max(max, i - m);
            }
            else map.put(prefixsum,i);
        }
        return max;
    }
}
