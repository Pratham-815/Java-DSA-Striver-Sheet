/**
 * LeetCode 121: Best Time to Buy and Sell Stock
 * Problem: Find the maximum profit by buying and selling a stock once
 * 
 * Time Complexity: O(n) - single pass through the array
 * Space Complexity: O(1) - using only constant extra space
 */
class LeetCode_121 {
    /**
     * Finds maximum profit that can be obtained by buying and selling once
     * @param prices array containing stock prices for each day
     * @return maximum profit possible
     */
    public int maxProfit(int[] prices) {
        // Initialize maximum profit and minimum buying price
        int maxPro = 0;            // Tracks maximum profit found so far
        int minPrice = Integer.MAX_VALUE;  // Tracks minimum price seen so far
        
        // Iterate through each price
        for(int i = 0; i < prices.length; i++) {
            // Update minimum price if current price is lower
            minPrice = Math.min(minPrice, prices[i]);
            
            // Calculate potential profit if we sell at current price
            // Update maxPro if current profit is higher
            maxPro = Math.max(maxPro, prices[i] - minPrice);
        }
        
        // Return the maximum profit found
        return maxPro;
    }
}