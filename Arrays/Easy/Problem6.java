/**
 * Problem: Move all zeroes to the end of array while maintaining relative order of non-zero elements
 * Time Complexity: O(n), where n is the length of the array
 * Space Complexity: O(1), modifying array in-place
 */
public class Problem6 {
    /**
     * Moves all zero elements to end of array while preserving order of non-zero elements
     * @param nums The input array to modify
     */
    public void moveZeroess(int[] nums) {
        // Count number of zeroes in array
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) count = count + 1;
        }

        // Move all non-zero elements to front of array, maintaining their relative order
        int j = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0) {
                nums[j] = nums[i];
                j = j + 1;
            }
        }

        // Fill remaining positions with zeroes
        for(int i = nums.length - count; i<nums.length; i++) {
            nums[i] = 0;
        }
    }
}