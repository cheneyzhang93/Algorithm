package algorithm.intermediate;

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-medium/31/linked-list/83/
 */
public class OddEvenList {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        l1.next.next.next.next.next = new ListNode(6);
        l1.next.next.next.next.next.next = new ListNode(7);
        l1.next.next.next.next.next.next.next = new ListNode(8);

        ListNode pre = oddEvenList(l1);
        while (pre != null) {
            System.out.print(pre.val);
            pre = pre.next;
        }
    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode fast = head.next, slow = head, fr = new ListNode(0), sr = new ListNode(0);
        ListNode frp = fr, srp = sr;
        while (fast != null) {
            srp = srp.next = new ListNode(slow.val);
            slow = slow.next.next;
            frp = frp.next = new ListNode(fast.val);
            fast = fast.next != null ? fast.next.next : null;
        }
        srp.next = slow;
        if (srp.next != null) {
            srp.next.next = fr.next;
        } else {
            srp.next = fr.next;
        }
        return sr.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
