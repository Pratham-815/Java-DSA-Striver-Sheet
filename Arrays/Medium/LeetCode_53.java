/**
 * LeetCode 53 - Maximum Subarray
 * Given an integer array nums, find the subarray with the largest sum.
 * 
 * Solution approach (Kadane's Algorithm):
 * 1. Track current running sum (currSum) and maximum sum seen (maxSum)
 * 2. For each element:
 *    - Add it to currSum
 *    - Update maxSum if currSum is larger
 *    - Reset currSum to 0 if it becomes negative (start fresh)
 * 3. Return the maximum sum found
 *
 * Time Complexity: O(n) - Single pass through the array
 * Space Complexity: O(1) - Only using two variables (currSum and maxSum)
 */
public class LeetCode_53 {
    public int maxSubArray(int[] nums) {
        // Track current running sum and maximum sum seen so far
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        // Iterate through array once
        for(int i=0; i<nums.length; i++){
            // Add current element to running sum
            currSum += nums[i];
            
            // Update maximum sum if current sum is larger
            maxSum = Math.max(maxSum, currSum);
            
            // If current sum becomes negative, reset it
            // This is because any future subarray would be larger without it
            if(currSum<=0){
                currSum = 0; 
            }
        }
        return maxSum;
    }
}
