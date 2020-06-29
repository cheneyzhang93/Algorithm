package algorithm.linkedlist;

/**
 * https://leetcode-cn.com/problems/partition-list-lcci/
 */
public class Partition {

    public static void main(String[] args) {
        // 3->5->8->5->10->2->1
        ListNode root = new ListNode(3);
        root.next = new ListNode(5);
        root.next.next = new ListNode(8);
        root.next.next.next = new ListNode(5);
        root.next.next.next.next = new ListNode(10);
        root.next.next.next.next.next = new ListNode(2);
        root.next.next.next.next.next.next = new ListNode(1);

        ListNode h = partition(root, 5);
        while (h != null) {
            System.out.print(h.val + "->");

            h = h.next;
        }
        System.out.println();
    }

    public static ListNode partition(ListNode head, int x) {
        ListNode s = head, f;
        while (s != null) {
            if (s.val >= x) {
                f = s.next;
                while (f != null) {
                    if (f.val < x) {
                        int v = s.val;
                        s.val = f.val;
                        f.val = v;

                        break;
                    }
                    f = f.next;
                }
            }
            s = s.next;
        }
        return head;
    }

}
