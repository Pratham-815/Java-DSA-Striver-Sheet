/**
 * LeetCode 2873: Maximum Value of an Ordered Triplet I
 * Time Complexity: O(n) - Single pass through the array
 * Space Complexity: O(1) - Using only three variables regardless of input size
 */
class Solution {
    public long maximumTripletValue(int[] nums) {
        // Stores the maximum value of (nums[i] - nums[j]) * nums[k]
        long result = 0;
        // Stores the maximum value of (nums[i] - nums[j]) encountered so far
        long maxDiff = 0;
        // Stores the maximum value of nums[i] encountered so far
        long maxi = 0;

        for(int k=0; k<nums.length; k++){
            // Update result with maximum of current result and (maxDiff * current number)
            result = Math.max(result, maxDiff * nums[k]);
            // Update maxDiff with maximum difference possible using current number
            maxDiff = Math.max(maxDiff, maxi - nums[k]);
            // Update maximum value seen so far
            maxi = Math.max(maxi, nums[k]);
        }

        return result;
    }
}