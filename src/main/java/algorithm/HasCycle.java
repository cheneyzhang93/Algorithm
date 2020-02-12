package algorithm;

import java.util.*;

/**
 * LeetCode：https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/6/linked-list/46/
 */
public class HasCycle {

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head1;
        System.out.println(hasCycle(head1));
    }

//    public static boolean hasCycle(ListNode head) {
//        if (head == null) return false;
//        if (head.next == null) return false;
//        List<ListNode> nodeList = new ArrayList<>();
//        boolean flag = false;
//        while (head != null) {
//            nodeList.add(head);
//            if (head.next != null) {
//                for (ListNode node : nodeList) {
//                    if (head.next.hashCode() == node.hashCode()) {
//                        flag = true;
//                        break;
//                    }
//                }
//                if (flag) break;
//            }
//            head = head.next;
//        }
//
//        return flag;
//    }

    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;
        if (head.next == null) return false;

        ListNode q = head;
        while (q != null && q.next != null) {
            head = head.next;
            q = q.next.next;
            if (head.equals(q)) return true;
        }
        return false;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
