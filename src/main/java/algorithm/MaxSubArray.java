package algorithm;

/**
 * LeetCode：https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/23/dynamic-programming/56/
 */
public class MaxSubArray {

    public static void main(String[] args) {
        int[] a = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(a));
    }

    public static int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        int sum = 0, max = nums[0];
        for (int num : nums) {
            max = Math.max(max, sum += num);
            if (sum < 0) sum = 0;
        }
        return max;
    }
}
