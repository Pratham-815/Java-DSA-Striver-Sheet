/**
 * LeetCode 2149: Rearrange Array Elements by Sign
 * 
 * Problem: Given an array of integers with equal number of positive and negative integers,
 * rearrange the array such that every consecutive pair of integers have opposite signs.
 * Specifically, arrange the array in [positive, negative, positive, negative, ...] order.
 * 
 * Time Complexity: O(n)
 * - We iterate through the input array once to separate positive and negative numbers: O(n)
 * - We iterate through half the array length to create the result array: O(n/2)
 * - Overall time complexity: O(n)
 * 
 * Space Complexity: O(n)
 * - We use two auxiliary arrays of size n/2 each: O(n)
 * - We create a result array of size n: O(n)
 * - Overall space complexity: O(n)
 */
public class LeetCode_2149 {
    /**
     * Rearranges the array elements so that positive and negative numbers alternate,
     * starting with a positive number.
     * 
     * @param nums Input array with equal number of positive and negative integers
     * @return A new array with alternating positive and negative integers
     */
    public int[] rearrangeArray(int[] nums) {
        // Initialize variables
        int i = 0;  // Index for iterating through the input array
        int[] arr_neg = new int[nums.length/2];  // Array to store negative numbers
        int[] arr_pos = new int[nums.length/2];  // Array to store positive numbers
        int pos_arr_pin = 0;  // Index for the positive array
        int neg_arr_pin = 0;  // Index for the negative array

        // First pass: Separate positive and negative numbers into two arrays
        while(i < nums.length){
            if(nums[i] >= 0){
                // Store positive numbers in arr_pos
                arr_pos[pos_arr_pin] = nums[i];
                i++;
                pos_arr_pin++;
            }
            else{
                // Store negative numbers in arr_neg
                arr_neg[neg_arr_pin] = nums[i];
                i++;
                neg_arr_pin++;
            }
        }

        // Create result array and initialize indices for positive and negative arrays
        int[] res = new int[nums.length];
        int posIndex = 0;
        int negIndex = 0;

        // Second pass: Merge the two arrays in alternating order
        // Place positive numbers at even indices (0, 2, 4, ...)
        // Place negative numbers at odd indices (1, 3, 5, ...)
        for (int k = 0; k < nums.length; k += 2) {
            res[k] = arr_pos[posIndex++];      // Add positive number
            res[k + 1] = arr_neg[negIndex++];  // Add negative number
        }

        return res;
    }
}
