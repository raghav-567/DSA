package Trees;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderSuccesor {
    public static void main(String[] args) {

    }
    public static int helper(TreeNode root,int val){
        if(root == null){
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
            if(curr.val == val){
                return q.peek;
            }
        }

        return 0;
    }
}
