package algorithm.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(inorderTraversal(root));

        System.out.println(inorderTraversal1(root));
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                TreeNode node = stack.pop();
                result.add(node.val);

                curr = node.right;
            }

        }

        return result;
    }

    public static List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversal2(root, result);
        return result;
    }

    public static void inorderTraversal2(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        inorderTraversal2(root.left, result);
        result.add(root.val);
        inorderTraversal2(root.right, result);
    }

}

