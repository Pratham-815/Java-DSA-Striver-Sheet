/**
 * Problem: Rotate an array to the right by k positions
 * Time Complexity: O(n), where n is the length of the array
 * Space Complexity: O(1), modifying array in-place using reversal algorithm
 */
public class Problem5 {
    
    /**
     * Rotates array to the right by k positions using array reversal method
     * @param nums Array to rotate
     * @param k Number of positions to rotate right
     */
    public void rotate(int[] nums, int k){
        // Handle case where k > array length by taking modulo
        k = k % nums.length;
        
        // Step 1: Reverse entire array
        reverse(nums, 0, nums.length-1);
        // Step 2: Reverse first k elements
        reverse(nums, 0, k-1);
        // Step 3: Reverse remaining elements
        reverse(nums, k, nums.length-1);
    }

    /**
     * Helper method to reverse array elements between start and end indices
     * @param nums Array to reverse
     * @param start Starting index
     * @param end Ending index
     */
    public void reverse(int[] nums, int start, int end){
        while(start < end){
            // Swap elements at start and end indices
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            // Move indices towards center
            start++;
            end--;
        }
    }
}