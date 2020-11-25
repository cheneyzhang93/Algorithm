package algorithm.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostorderTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(postorderTraversal(root));

        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);
        root1.right.left = new TreeNode(3);
        System.out.println(postorderTraversal1(root1));
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.peek();
            if (node.left != null) {
                stack.push(node.left);
                node.left = null;
            } else if (node.right != null) {
                stack.push(node.right);
                node.right = null;
            } else {
                TreeNode n = stack.pop();
                result.add(n.val);
            }
        }

        return result;
    }

    public static List<Integer> postorderTraversal1(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderTraversal2(root, result);
        return result;
    }

    public static void postorderTraversal2(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        postorderTraversal2(root.left, result);
        postorderTraversal2(root.right, result);
        result.add(root.val);
    }

}

