package algorithm.everyday;


import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/coin-change/
 */
public class CoinChange {

    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{1, 2, 5}, 11));
        System.out.println(coinChange(new int[]{2}, 3));
    }

    public static int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];

//        int[] res = new int[amount + 1];
//        for (int i = 1; i <= amount; i++) {
//            int min = Integer.MAX_VALUE;
//            for (int coin : coins) {
//                if (i - coin >= 0 && res[i - coin] >= 0 && res[i - coin] < min) {
//                    min = res[i - coin];
//                }
//                res[i] = (min == Integer.MAX_VALUE ? -1 : min + 1);
//            }
//        }
//        return res[amount];

    }
}
