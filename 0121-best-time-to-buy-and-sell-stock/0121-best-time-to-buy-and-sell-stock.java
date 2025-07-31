class Solution {
    public int maxProfit(int[] prices) {
        int sell = prices[0];
        int buy = prices[0];
        int profit = 0;
        int profitMax = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
                sell = prices[i];
            }
            if (prices[i] > sell) {
                sell = prices[i];
            }

            profit = sell - buy;
            if (profitMax < profit) {
                profitMax = profit;
            }
        }
        return profitMax;
    }
}