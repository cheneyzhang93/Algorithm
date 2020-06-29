package algorithm.linkedlist;

/**
 * https://leetcode-cn.com/problems/linked-list-cycle-lcci/
 */
public class DetectCycle {

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = root;
        System.out.println(detectCycle(root));
    }

    public static ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode s = head, f = head;
        while (f != null && f.next != null) {

            s = s.next;
            f = f.next.next;

            if (s == f) {
                break;
            }

        }

        if (f == null || f.next == null) {
            return null;
        }

        s = head;
        while (s != f) {
            s = s.next;
            f = f.next;
        }

        return s;
    }
}

