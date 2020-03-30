package algorithm.intermediate;

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-medium/31/linked-list/84/
 */
public class GetIntersectionNode {

    public static void main(String[] args) {
        ListNode common = new ListNode(2);
        common.next = new ListNode(4);
//        common.next.next = new ListNode(5);

        ListNode a = new ListNode(0);
        a.next = new ListNode(9);
        a.next.next = new ListNode(1);
//        a.next.next = new ListNode(3);
        a.next.next.next = common;

        ListNode b = new ListNode(1);
        b.next = new ListNode(2);
        b.next.next = common;
//        ListNode b = new ListNode(3);
//        b.next = common;

        ListNode pre = getIntersectionNode(a, b);
        while (pre != null) {
            System.out.print(pre.val);
            pre = pre.next;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode apre = headA, bpre = headB;
        while (apre != bpre) {
            bpre = bpre != null ? bpre.next : headA;
            apre = apre != null ? apre.next : headB;
        }
        return apre;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
