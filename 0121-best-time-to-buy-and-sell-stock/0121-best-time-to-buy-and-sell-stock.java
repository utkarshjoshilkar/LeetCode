class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > buy) { // profit 
                int profit = prices[i] - buy;
                if (profit > maxprofit)
                    maxprofit = profit;
            } else {
                buy = prices[i];
            }
        }
        return maxprofit;
    }
}
