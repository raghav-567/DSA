package Leetcode;

import javax.swing.tree.TreeNode;

public class L101 {
    public static void main(String[] args) {

    }
    public boolean isSymmetric(TreeNode root) {
        return helper(root.left, root.right);
    }
}
        public boolean helper(TreeNode l, TreeNode r){
            if(l == null && r == null)
                return true;
            if((l == null && r != null)  || (l != null && r == null))
                return false;
            if(l.val != r.val)
                return false;
            return helper(l.left, r.right) && helper(l.right, r.left);
        }

        }

