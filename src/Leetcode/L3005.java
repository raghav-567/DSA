package Leetcode;
import java.util.*;
public class L3005 {
    public int maxFrequencyElements(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        int count = 0;
        int max_freq  = 0;
        for(int entry : map.values()){
            max_freq = Math.max(max_freq , entry);
        }
        for (int freq : map.values()) {
            if (freq == max_freq)
                count += max_freq;
        }
        return count;
    }
}
