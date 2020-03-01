package algorithm.elementary;

/**
 * LeetCode：https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/6/linked-list/43/
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
