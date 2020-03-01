package algorithm.elementary;

/**
 * LeetCode：https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/7/trees/51/
 */
public class SortedArrayToBST {

    public static void main(String[] args) {
        int[] nums = new int[]{-10, -3, 0, 5, 9};
        sortedArrayToBST(nums);
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        if (nums.length == 1) return new TreeNode(nums[0]);
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    public static TreeNode sortedArrayToBST(int[] nums, int left, int right) {
        if (left > right) return null;
        int mid = (right + left) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBST(nums, left, mid - 1);
        node.right = sortedArrayToBST(nums, mid + 1, right);
        return node;
    }

//    public static class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//
//        TreeNode(int x) {
//            val = x;
//        }
//    }
}
