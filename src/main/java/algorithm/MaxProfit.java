package algorithm;

/**
 * LeetCode：https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/23/dynamic-programming/55/
 */
public class MaxProfit {

    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

//    public static int maxProfit(int[] prices) {
//        int max = 0;
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = i + 1; j < prices.length; j++) {
//                if (prices[j] > prices[i]) {
//                    max = Math.max(max, prices[j] - prices[i]);
//                }
//            }
//        }
//        return max;
//    }

    public static int maxProfit(int[] prices) {
        if (prices.length == 0 || prices.length == 1) return 0;
        int curr = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (curr > prices[i]) {
                curr = prices[i];
            } else {
                int temp = prices[i] - curr;
                if (temp > max) max = temp;
            }
        }
        return max;
    }

}
