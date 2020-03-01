package algorithm.everyday;

/**
 * https://leetcode-cn.com/problems/reverse-linked-list/
 */
public class ReverseList {

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        ListNode pre = reverseList(head1);
        while (pre != null) {
            System.out.print(pre.val + " ");
            pre = pre.next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode p = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = p;
            p = head;
            head = temp;
        }
        // p -> null
        // head -> 1 2 3 4 5
        // head.next = null
        // p = 1
        // head = 2

        // p -> 1
        // head -> 2 3 4 5
        // head.next = 1
        // p = 2
        // head = 3

        // p -> 2 1
        // head -> 3 4 5
        // head.next = 2
        // p = 3
        // head = 4

        // p -> 3 2 1
        return p;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
