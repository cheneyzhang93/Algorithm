package algorithm.dp;

/**
 * LeetCode：https://leetcode-cn.com/problems/min-cost-climbing-stairs/
 */
public class MinCostClimbingStairs {

    public static void main(String[] args) {
        int[] a = new int[]{10, 15, 20};
        int[] b = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs(a));
        System.out.println(minCostClimbingStairs(b));
    }

    public static int minCostClimbingStairs(int[] cost) {
        int dp1 = 0, dp2 = 0;
        for (int i = 2; i <= cost.length; i++) {
            int temp = dp2;
            dp2 = Math.min(dp2 + cost[i - 1], dp1 + cost[i - 2]);
            dp1 = temp;
        }
        return dp2;

    }
}
