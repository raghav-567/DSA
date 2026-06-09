package Trees;

public class L653 {
    public static void main(String[] args) {

    }
    HashSet<Integer> set;

    public boolean findTarget(TreeNode root, int k) {
        set = new HashSet<>();
        return solve(root, k);
    }

    public boolean solve(TreeNode root, int k) {
        if (root == null) {
            return false;
        }

        if (set.contains(k - root.val)) {
            return true;
        }

        set.add(root.val);

        return solve(root.left, k) || solve(root.right, k);
    }
}
