class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int length = prices.length;
        int i = 0;
        int j = i + 1;
        while (i < length && j < length) {
            int boughtAt = prices[i];
            int sellAt = prices[j];
            if (sellAt - boughtAt >= 0) {
                maxprofit = Math.max(maxprofit, sellAt - boughtAt);
            } else {
                i = j;
            }
            j++;
        }

        return maxprofit;
    }
}
