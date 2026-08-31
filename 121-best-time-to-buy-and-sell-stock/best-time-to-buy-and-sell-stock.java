class Solution {
    public int maxProfit(int[] prices) {
        int minprice = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            }
            int currentProfit = prices[i] - minprice;
            profit = Math.max(profit, currentProfit);
        }
        return profit;
    }
}