package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class L1642 {
    public static void main(String[] args) {

    }
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int i;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(i = 0 ; i < heights.length-1 ; i++){
            if(heights[i+1] <= heights[i]){
                continue;
            }
            int diff = heights[i+1] - heights[i];
            if(bricks >= diff){
                bricks -= diff;
                pq.add(diff);
            } else if(ladders > 0){
                if(!pq.isEmpty()){
                    int max = pq.peek();
                    if(max > diff){
                        bricks += pq.poll();
                        bricks -= diff;
                        pq.add(diff);
                        ladders --;
                    }
                    else{
                        ladders --;
                    }
                }
                else{
                    ladders --;
                }
            }else{
                return i;
            }
        }
        return i;
    }
}
