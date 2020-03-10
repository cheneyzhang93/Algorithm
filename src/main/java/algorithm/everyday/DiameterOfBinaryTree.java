package algorithm.everyday;


/**
 * https://leetcode-cn.com/problems/diameter-of-binary-tree/
 */
public class DiameterOfBinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(diameterOfBinaryTree(root));
    }

    private static int diam = 0;

    public static int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return diam;
    }

    private static int helper(TreeNode node) {
        if (node == null) return 0;
        int leftDiam = helper(node.left);
        int rightDiam = helper(node.right);
        diam = Math.max(leftDiam + rightDiam, diam);
        return Math.max(leftDiam, rightDiam) + 1;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
