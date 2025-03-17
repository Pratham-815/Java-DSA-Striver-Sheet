import java.util.Arrays;

/**
 * LeetCode 2206: Divide Array Into Equal Pairs
 * Problem: Check if array can be divided into pairs where elements in each pair are equal
 */
public class LeetCode_2206 {
    /**
     * Determines if an array can be divided into pairs of equal elements
     * 
     * Approach:
     * 1. Sort the array first
     * 2. Check adjacent elements in pairs
     * 3. If any pair has unequal elements, return false
     * 
     * @param nums Input array of integers
     * @return true if array can be divided into equal pairs, false otherwise
     * 
     * Time Complexity: O(nlogn) due to sorting
     * Space Complexity: O(1) as we're using constant extra space
     */
    public boolean divideArray(int[] nums) {
        // Sort array to group equal elements together
        Arrays.sort(nums);

        // Check adjacent elements in pairs (i and i-1)
        for(int i=1; i<nums.length; i+=2){
            if(nums[i] != nums[i-1]) return false;
        }

        return true;
    }
}
