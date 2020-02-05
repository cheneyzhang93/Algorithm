package algorithm;

/**
 * LeetCode：https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/6/linked-list/42/
 */
public class DeleteNode {

    public static void main(String[] args) {
        deleteNode(new ListNode(4));
        deleteNode(new ListNode(5));
        deleteNode(new ListNode(1));
        deleteNode(new ListNode(9));
    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
