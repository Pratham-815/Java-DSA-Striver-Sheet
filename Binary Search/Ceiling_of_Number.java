/*
 * Time Complexity: O(log n) - Binary Search halves the search space in each iteration
 * Space Complexity: O(1) - Only using constant extra space
 */
public class Ceiling_of_Number {
    /**
     * Finds the ceiling of a target number in a sorted array
     * Ceiling is the smallest element in array greater than or equal to target
     * 
     * @param arr    Sorted array to search in
     * @param target Number to find ceiling for
     * @return Index of ceiling element, or -1 if no ceiling exists
     */
    public int ceiling(int[] arr, int target){
        // If target is greater than the largest element, no ceiling exists
        if(target > arr[arr.length-1]) return -1;

        // Initialize binary search boundaries
        int start = 0;
        int end = arr.length - 1;

        // Binary search implementation
        while(start <= end){
            int mid = (start + end)/2;  // Find middle element

            if(arr[mid] == target){
                return mid;  // Target found
            }
            else if(target > arr[mid]){
                start = mid + 1;  // Search in right half
            }
            else{
                end = mid - 1;  // Search in left half
            }
        }
        
        // 'start' will point to the ceiling element when target is not found
        return start;
    }
}
