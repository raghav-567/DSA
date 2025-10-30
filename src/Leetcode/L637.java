package Leetcode;

import javax.swing.tree.TreeNode;
import java.util.*;

public class L637 {
    public static void main(String[] args) {

    }
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Double> result = new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            double sum = 0;
            for(int i = 0 ; i < size ; i++){
                TreeNode k = q.poll();
                sum += k.val;
                if(k.left != null){
                    q.add(k.left);
                }
                if(k.right != null){
                    q.add(k.right);
                }
            }
            result.add(sum/size);
        }
        return result;
    }
}
