package category.array;

/**
 * 714. 买卖股票的最佳时机含手续费
 * <p>
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/
 */
public class MaxProfit_714 {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1, 3, 2, 8, 4, 9}, 2));
        System.out.println(maxProfit(new int[]{1, 3, 7, 5, 10, 3}, 3));
    }

    public static int maxProfit(int[] prices, int fee) {
        if (prices.length == 0 || prices.length == 1) return 0;
        int cash = 0, hold = -prices[0];
        for (int price : prices) {
            // 卖出
            cash = Math.max(cash, hold + price - fee);
            // 买入
            hold = Math.max(hold, cash - price);
        }
        return cash;
    }

}
