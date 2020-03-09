package algorithm.everyday;

public class MaxProfit {

    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        if (prices.length == 0 || prices.length == 1) return 0;
        int max = 0;
        int curr = prices[0];
        for (int i = 1; i < prices.length; i++) {
            curr = Math.min(curr, prices[i]);
            max = Math.max(max, prices[i] - curr);
        }
        return max;
    }
}
