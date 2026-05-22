package Stack;

import java.util.HashMap;
import java.util.Stack;

public class L496 {
    public static void main(String[] args) {

    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        for(int i = n-1 ; i >= 0 ; i--){
            while(!s.isEmpty() && s.peek() < nums2[i]){
                s.pop();
            }
            if(s.isEmpty()){
                map.put(nums2[i],-1);
            }else{
                map.put(nums2[i],s.peek());
            }
            s.push(nums2[i]);
        }
        for(int i = 0 ; i < nums1.length ; i++){
            if(map.containsKey(nums1[i])){
                nums1[i] = map.get(nums1[i]);
            }
        }
        return nums1;
    }
}
