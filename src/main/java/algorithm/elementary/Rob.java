package algorithm.elementary;

/**
 * LeetCode：https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/23/dynamic-programming/57/
 */
public class Rob {

    public static void main(String[] args) {
        int[] a = new int[]{2, 7, 9, 3, 1};
        System.out.println(rob(a));
    }

    public static int rob(int[] nums) {
        int dp1 = 0, dp2 = 0;
        for (int num : nums) {
            int temp = dp2;
            dp2 = Math.max(dp2, dp1 + num);
            dp1 = temp;
        }
        return dp2;
    }

}
