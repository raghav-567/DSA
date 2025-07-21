package BackTracking;
import java.util.*;

public class Subsets {
    public static void main(String[] args) {
        int[] nums = {1,3,8,9};
        System.out.println(subsets(nums));
    }
    public static List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            find(nums,0,ans,new ArrayList<>());
            return ans;
        }
        public static void find(int[] nums , int index,List<List<Integer>> ans,ArrayList<Integer> ds){
            if(index >= nums.length){
                ans.add(new ArrayList<>(ds));
                return;
            }
            ds.add(nums[index]);
            find(nums,index+1,ans,ds);
            ds.remove(ds.size()-1);
            find(nums,index+1,ans,ds);

        }
    }

