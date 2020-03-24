package algorithm.everyday;

/**
 * https://leetcode-cn.com/problems/the-masseuse-lcci/
 */
public class Massage {

    public static void main(String[] args) {
        System.out.println(massage(new int[]{1, 2, 3, 1}));
        System.out.println(massage(new int[]{2, 7, 9, 3, 1}));
        System.out.println(massage(new int[]{2, 1, 4, 5, 3, 1, 1, 3}));
    }

    public static int massage(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int dp0 = 0, dp1 = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = dp1;
            dp1 = Math.max(dp1, dp0 + nums[i]);
            dp0 = temp;
        }
        return dp1;
    }
}
