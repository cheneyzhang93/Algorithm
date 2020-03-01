package algorithm.elementary;

/**
 * LeetCode：https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/6/linked-list/44/
 */
public class MergeTwoLists {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(4);

        ListNode node2 = new ListNode(1);
        node1.next = new ListNode(3);
        node1.next.next = new ListNode(5);

        ListNode pre = mergeTwoLists(node1, node2);
        while (pre != null) {
            System.out.print(pre.val + " ");
            pre = pre.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode pre = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                pre.next = l1;
                l1 = l1.next;
            } else {
                pre.next = l2;
                l2 = l2.next;
            }
            pre = pre.next;
        }
        pre.next = l1 != null ? l1 : l2;
        return head.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
