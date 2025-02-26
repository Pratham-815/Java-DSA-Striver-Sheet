/**
 * LeetCode 75 - Sort Colors
 * Given an array nums with n objects colored red, white, or blue (represented by 0, 1, and 2),
 * sort them in-place so that objects of the same color are adjacent.
 *
 * Solution approach:
 * 1. Count occurrences of 0s and 1s (2s can be derived)
 * 2. Overwrite array sections with appropriate counts of each number
 * 
 * Time Complexity: O(n) - Two passes through the array
 * Space Complexity: O(1) - Only using two counter variables
 */
class Solution {
    public void sortColors(int[] nums) {
        // Count occurrences of 0s and 1s
        int count0 = 0;
        int count1 = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0) count0 += 1;
            else if(nums[i] == 1) count1 += 1;
        }

        // Fill first section with 0s
        for(int i=0; i<count0; i++){
            nums[i] = 0;
        }

        // Fill middle section with 1s
        for(int i=count0; i<(count0 + count1); i++){
            nums[i] = 1;
        }

        // Fill remaining section with 2s
        for(int i=(count0 + count1); i<nums.length; i++){
            nums[i] = 2;
        }
    }
}