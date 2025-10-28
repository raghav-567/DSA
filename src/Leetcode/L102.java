package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class L102 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null){
            return ans;
        }
        int size = 0;
        queue.add(root);
        while(!queue.isEmpty()){
            size = queue.size();
            List<Integer> current = new ArrayList<>(size);
            for(int i = 0 ; i < size ; i++){
                TreeNode curr = queue.poll();
                current.add(curr.val);
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
            }
            ans.add(current);
        }
        return ans;
    }
}
