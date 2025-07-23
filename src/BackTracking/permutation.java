package BackTracking;
import java.util.*;

public class permutation {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
    }
        public static List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            solve(new ArrayList<>(),nums,ans,new HashSet<>());
            return ans;
        }
        public static void solve(ArrayList<Integer> ds,int[] nums,List<List<Integer>> ans,HashSet<Integer> set){
            if(ds.size() == nums.length){
                ans.add(new ArrayList<>(ds));
                return;
            }
            for(int i = 0 ; i < nums.length ; i++){
                if(!set.contains(nums[i])){
                    ds.add(nums[i]);
                    set.add(nums[i]);
                    solve(ds,nums,ans,set);
                    int removed = ds.remove(ds.size() - 1);
                    set.remove(removed);
                }
            }

        }
    }

