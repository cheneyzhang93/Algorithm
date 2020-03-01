package algorithm.dp;

/**
 * https://leetcode-cn.com/problems/the-masseuse-lcci/
 */
public class Massage {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 1, 4, 5, 3, 1, 1, 3};
        System.out.println(massage(nums));
    }


    public static int massage(int[] nums) {
        if (nums.length == 0) return 0;
        int dp0 = 0, dp1 = nums[0];
        for (int i = 2; i <= nums.length; i++) {
            int temp = dp1;
            dp1 = Math.max(dp1, dp0 + nums[i - 1]);
            dp0 = temp;
        }
        return dp1;

    }
}
