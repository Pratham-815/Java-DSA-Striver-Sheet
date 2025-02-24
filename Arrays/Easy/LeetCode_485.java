/**
 * LeetCode 485: Max Consecutive Ones
 * Time Complexity: O(n) - where n is the length of input array
 * Space Complexity: O(1) - using only constant extra space
 */
public class LeetCode_485 {
    /**
     * Finds the maximum number of consecutive 1's in the binary array
     * @param nums Input array containing only 0's and 1's
     * @return Length of longest sequence of consecutive 1's
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;        // Count current streak of 1s
        int maxCount = 0;      // Track the maximum streak seen so far

        // Iterate through each number in array
        for (int num : nums) {
            if (num == 1) {
                count++;                       // Increment count if it's 1
                maxCount = Math.max(maxCount, count); // Update max count if current streak is longer
            } else {
                count = 0; // Reset count when a 0 is encountered
            }
        }

        // Return the longest streak of 1's found
        return maxCount;
    }
}
