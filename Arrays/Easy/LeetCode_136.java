/**
 * LeetCode 136: Single Number
 * Time Complexity: O(n) - where n is the length of input array
 * Space Complexity: O(1) - using only constant extra space
 */
public class LeetCode_136 {
    /**
     * Finds the single element that appears only once in the array
     * where every other element appears twice
     * @param nums Input array of integers
     * @return The element that appears only once
     */
    public int singleNumber(int[] nums) {
        // If array has only one element, return that element
        if(nums.length == 1) return nums[0];

        // Using XOR operation to find single number:
        // - XOR of a number with itself is 0
        // - XOR of a number with 0 is the number itself
        // - XOR is associative and commutative
        int result = 0;
        for(int i=0; i<nums.length; i++){
            result = result^nums[i];  // XOR current number with result
        }
        
        // Final result will be the number that appears only once
        return result;
    }
}
