/**
 * LeetCode 27: Remove Element
 * Time Complexity: O(n) - where n is the length of input array
 * Space Complexity: O(1) - using only constant extra space
 */
public class LeetCode_27 {
    /**
     * Removes all instances of val from nums array and returns new length
     * @param nums Input array of integers
     * @param val Value to remove from array
     * @return Number of elements remaining after removing val
     */
    public int removeElement(int[] nums, int val) {
        // Keep track of position where non-val elements should be placed
        int index = 0;
        
        // Iterate through array
        for(int i=0; i<nums.length; i++){
            // If current element is not val, copy it to index position
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
            // If element is val, skip it (effectively removing it)
        }
        
        // Return new length of array (number of elements not equal to val)
        return index;
    }
}
