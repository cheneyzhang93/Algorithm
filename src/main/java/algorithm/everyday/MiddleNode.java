package algorithm.everyday;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/middle-of-the-linked-list/
 */
public class MiddleNode {

    public static void main(String[] args) {

        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);

        ListNode root1 = new ListNode(1);
        root1.next = new ListNode(2);
        root1.next.next = new ListNode(3);
        root1.next.next.next = new ListNode(4);
        root1.next.next.next.next = new ListNode(5);
        root1.next.next.next.next.next = new ListNode(6);

        System.out.println(middleNode(root).toString());
        System.out.println(middleNode(root1).toString());

        System.out.println(7/2);
    }

    public static ListNode middleNode(ListNode head) {
        if (head.next == null) return head;
        if (head.next.next == null) return head.next;

        List<ListNode> listNodes = new ArrayList<>();
        ListNode pre = head;
        listNodes.add(pre);
        while (pre != null) {
            head = head.next;
            pre = head;
            if (pre != null) {
                listNodes.add(pre);
            }
        }

        return listNodes.get(listNodes.size() / 2);
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return "val=" + val + ",next=" + (next != null ? next.toString() : "");
        }
    }
}
