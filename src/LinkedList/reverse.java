package LinkedList;

public class reverse {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }

        return prev;
    }

    // Helper to print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "  ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example: 1 -> 2 -> 3 -> 4 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.println("Original List:");
        printList(head);
        head = reverseList(head);

        System.out.println("Reversed List:");
        printList(head);
    }
}
