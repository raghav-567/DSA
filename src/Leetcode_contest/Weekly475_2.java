package Leetcode_contest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Weekly475_2 {
    public static void main(String[] args) {

    }
    public int minimumDistance(int[] nums) {
        if(nums.length < 3){
            return -1;
        }
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        int min = Integer.MAX_VALUE;
        for(List<Integer>entry:map.values()){
            if(entry.size() < 3){
                continue;
            }
            Collections.sort(entry);
            for(int i = 0 ; i < entry.size() - 2 ; i++ ){
                int a = entry.get(i);
                int b = entry.get(i+1);
                int c = entry.get(i+2);
                int dis = Math.abs(a-b) + Math.abs(a-c) + Math.abs(b-c);
                if(dis<min){
                    min = dis;
                }
            }
        }
        if(min == Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}
