package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode：https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/6/linked-list/45/
 */
public class IsPalindrome1 {

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(2);
        head1.next.next.next.next = new ListNode(1);

        System.out.print(isPalindrome(head1));
    }

    public static boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        for (int i = 0; i < list.size() / 2; i++) {
            if (!list.get(i).equals(list.get(list.size() - 1 - i))) return false;
        }
        return true;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
