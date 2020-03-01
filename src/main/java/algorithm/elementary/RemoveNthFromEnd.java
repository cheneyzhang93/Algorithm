package algorithm.elementary;

/**
 * LeetCode：https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/6/linked-list/42/
 */
public class RemoveNthFromEnd {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(3);
        node1.next.next.next = new ListNode(4);
        node1.next.next.next.next = new ListNode(5);

        ListNode result = removeNthFromEnd(node1, 5);
        ListNode pre = result;
        while (pre != null) {
            System.out.print(pre.val + " ");
            pre = pre.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = new ListNode(0);// 参考解题，用一个虚拟节点，防止是头结点删除
        node.next = head;
        ListNode p = node, q = node;
        while (n + 1 > 0) {
            p = p.next;
            n--;
        }
        while (p != null) {
            p = p.next;
            q = q.next;
        }
        q.next = q.next.next;
        return node.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
