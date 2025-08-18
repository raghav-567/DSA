package LinkedList;


public class RotateList{
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        int len = getLen(head);
        k = k % len;
        if (k == 0) return head;

        ListNode temp = head;
        for (int i = 0; i < len - k - 1; i++) {
            temp = temp.next;
        }

        ListNode newHead = temp.next;
        temp.next = null;
        ListNode tail = getTail(newHead);
        tail.next = head;

        return newHead;
    }

    public ListNode getTail(ListNode head) {
        while (head.next != null) {
            head = head.next;
        }
        return head;
    }

    public int getLen(ListNode head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }

    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RotateList sol = new RotateList();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original list: ");
        sol.printList(head);

        // Rotate right by 2
        ListNode rotated = sol.rotateRight(head, 2);

        System.out.print("Rotated list: ");
        sol.printList(rotated);
    }
}

