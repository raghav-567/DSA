package LinkedList;

public class Palindrome {

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;


        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalfHead = reverseList(slow);

        ListNode firstHalfHead = head;
        ListNode copySecondHalf = secondHalfHead;
        boolean isPalin = true;

        while (secondHalfHead != null) {
            if (firstHalfHead.val != secondHalfHead.val) {
                isPalin = false;
                break;
            }
            firstHalfHead = firstHalfHead.next;
            secondHalfHead = secondHalfHead.next;
        }

        reverseList(copySecondHalf);

        return isPalin;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        Palindrome solution = new Palindrome();
        System.out.println(solution.isPalindrome(head));


    }
}

