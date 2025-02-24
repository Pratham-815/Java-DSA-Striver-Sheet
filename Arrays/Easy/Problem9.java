/**
 * Problem 9: Find the Missing Number
 * Time Complexity: O(n) - where n is the length of input array
 * Space Complexity: O(1) - using only constant extra space
 */
public class Problem9 {
    /**
     * Finds the missing number in an array containing n distinct numbers in range [0, n]
     * @param nums Input array of integers
     * @return The missing number from the sequence
     */
    public int missingNumber(int[] nums) {
        // Get length of array which represents n
        int n = nums.length;
        
        // Calculate expected sum using arithmetic sequence formula: n*(n+1)/2
        int expectedSum = n * (n + 1) / 2;
        
        // Calculate actual sum of array elements
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        
        // Missing number is the difference between expected and actual sum
        return expectedSum - actualSum;
    }
}