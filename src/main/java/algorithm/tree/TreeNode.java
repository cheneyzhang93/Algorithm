package algorithm.tree;

public class TreeNode {

    int val;
    algorithm.tree.TreeNode left;
    algorithm.tree.TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, algorithm.tree.TreeNode left, algorithm.tree.TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
