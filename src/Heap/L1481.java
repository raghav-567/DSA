package Heap;

import java.util.HashMap;
import java.util.PriorityQueue;

public class L1481 {
    public static void main(String[] args) {
    // Leetcode 1481
    }
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(map.values());
        while(!pq.isEmpty() && k >= pq.peek()){
            k -= pq.poll();
        }
        return pq.size();
    }
}
