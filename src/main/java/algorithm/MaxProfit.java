package algorithm;

/**
 * leetcode:https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/22/
 */
public class MaxProfit {

    public static void main(String[] args) {
        int[] prices = new int[]{1, 2, 3, 4, 5};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (i + 1 < prices.length && prices[i + 1] > prices[i]) {
                max += prices[i + 1] - prices[i];
            }
        }
        return max;
    }

}
