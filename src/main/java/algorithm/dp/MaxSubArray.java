package algorithm.dp;

/**
 * https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/
 */
public class MaxSubArray {

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int dp0 = 0, dp1 = nums[0];
        for (int n : nums) {
            dp1 = Math.max(dp1, dp0 += n);
            if (dp0 < 0) dp0 = 0;
        }
        return dp1;
    }
}
