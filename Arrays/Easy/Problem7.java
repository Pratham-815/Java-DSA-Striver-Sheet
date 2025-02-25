/**
 * Linear Search Implementation
 * Time Complexity: O(n) - where n is the length of input array
 * Space Complexity: O(1) - using only constant extra space
 */
public class Problem7 {
    /**
     * Searches for target element in array using linear search algorithm
     * @param arr Input array to search in
     * @param target Element to search for
     * @return Index of target if found, -1 if not found
     */
    public int linearSearch(int[] arr, int target) {
        // Iterate through array sequentially
        for(int i=0; i<arr.length; i++) {
            // If current element matches target, return its index
            if(arr[i] == target) {
                return i;
            }
        }
        // Target not found in array
        return -1;
    }
}
