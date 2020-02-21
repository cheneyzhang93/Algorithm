package algorithm;


import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode：https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/7/trees/51/
 */
public class LevelOrder {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(2);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(2);
        System.out.println(levelOrder(root));
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        levelOrder(list, root, 0);
        return list;
    }

    public static void levelOrder(List<List<Integer>> list, TreeNode root, int rows) {
        if (root == null) return;

        if (list.size() <= rows) {
            List<Integer> integers = new ArrayList<>();
            integers.add(root.val);
            list.add(integers);
        } else {
            list.get(rows).add(root.val);
        }

        levelOrder(list, root.left, rows + 1);
        levelOrder(list, root.right, rows + 1);
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
