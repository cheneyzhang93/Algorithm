package algorithm.tree;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class IsSymmetric {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(7);
        root.right.right = new TreeNode(7);
        System.out.println(isSymmetric(root));

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(7);
        root1.right.right = new TreeNode(7);
        System.out.println(isSymmetric1(root1));
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        }
        return isSymmetric(root.left, root.right);
    }

    public static boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null) {
            return right == null;
        }
        if (right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }

    public static boolean isSymmetric1(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode q = queue.poll();
            TreeNode p = queue.poll();
            if (q == null && p == null) {
                continue;
            }
            if (q == null || p == null || (q.val != p.val)) {
                return false;
            }
            queue.add(q.left);
            queue.add(p.right);
            queue.add(q.right);
            queue.add(p.left);
        }
        return true;
    }


}
