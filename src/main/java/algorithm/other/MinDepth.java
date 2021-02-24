package algorithm.other;

import algorithm.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MinDepth {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        System.out.println(minDepth(root));
    }

    public static int minDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int depth = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                if (curr != null) {
                    if (curr.left == null && curr.right == null) {
                        return depth;
                    }
                    if (curr.left != null) {
                        queue.add(curr.left);
                    }

                    if (curr.right != null) {
                        queue.add(curr.right);
                    }
                }
                depth++;
            }
        }
        return depth;
    }
}
