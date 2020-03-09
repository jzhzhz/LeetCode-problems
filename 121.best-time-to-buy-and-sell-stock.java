/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 0) {
            return 0;
        }

        int minPrice = prices[0], maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > minPrice) {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            } else {
                minPrice = prices[i];
            }
        }

        return maxProfit;
    }
}
// @lc code=end

