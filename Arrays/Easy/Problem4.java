package Arrays.Easy;

/**
 * Problem: Remove duplicates from a sorted array in-place
 * Time Complexity: O(n), where n is the length of the array
 * Space Complexity: O(1), modifying array in-place
 */
public class Problem4 {
    /**
     * Removes duplicates from a sorted array by modifying it in-place
     * @param nums The sorted input array to remove duplicates from
     * @return The number of unique elements in the modified array
     */
    public int removeDuplicates(int[] nums){
        // i keeps track of the position where next unique element should be placed
        int i=0;
        
        // Iterate through array starting from second element
        for(int j=1; j<nums.length; j++){
            // If current element is different from element at last unique position
            if(nums[i] != nums[j]){
                // Increment i to get next position for unique element
                i = i+1;
                // Place the new unique element at position i
                nums[i] = nums[j];
            }
            // If elements are same, skip current element as it's a duplicate
        }
        
        // Return count of unique elements (i+1 because i is 0-based)
        return i+1;
    }
}
