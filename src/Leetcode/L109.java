package Leetcode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null){
            return null;
        }
        return ans(head, null);
    }
    public TreeNode ans(ListNode head , ListNode end){
        if(head == end){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != end && fast.next != end){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode k = slow.next;
        TreeNode node = new TreeNode(slow.val);
        node.left = ans(head,slow);
        node.right = ans(k,end);

        return node;
    }
}
