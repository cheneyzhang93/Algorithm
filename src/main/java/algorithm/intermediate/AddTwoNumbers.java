package algorithm.intermediate;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-medium/31/linked-list/82/
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
//        ListNode l1 = new ListNode(2);
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(3);
//
//        ListNode l2 = new ListNode(5);
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);
        ListNode l1 = new ListNode(5);

        ListNode l2 = new ListNode(5);

        ListNode pre = addTwoNumbers(l1, l2);
        while (pre != null) {
            System.out.print(pre.val);
            pre = pre.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> f = new ArrayList<>(), s = new ArrayList<>();
        ListNode pre = l1;
        while (pre != null) {
            f.add(pre.val);
            pre = pre.next;
        }
        pre = l2;
        while (pre != null) {
            s.add(pre.val);
            pre = pre.next;
        }

        ListNode r = new ListNode(0), rp = r;
        int carryBit = 0, len = Math.max(f.size(), s.size());
        for (int i = 0; i < len; i++) {
            int fN = f.size() - 1 >= i ? f.get(i) : 0;
            int sN = s.size() - 1 >= i ? s.get(i) : 0;
            int curr = fN + sN + carryBit;
            if (curr > 9) {
                curr %= 10;
                carryBit = 1;
            } else {
                carryBit = 0;
            }
            rp = rp.next = new ListNode(curr);
        }
        if (carryBit == 1) {
            rp.next = new ListNode(carryBit);
        }
        return r.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
