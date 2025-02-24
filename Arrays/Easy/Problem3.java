package Arrays.Easy;

/**
 * Problem: Check if an array can be sorted by rotating it
 * Time Complexity: O(n^2), where n is the length of the array
 * Space Complexity: O(1), modifying array in-place
 */
public class Problem3 {
    /**
     * Checks if array can be sorted by rotating it
     * @param arr Input array to check
     * @return true if array can be sorted by rotation, false otherwise
     */
    public boolean check(int[] arr){
        int x = 0;
        // Try rotating array up to array length times
        while(x <= arr.length){
            // If array is sorted at any point, return true
            if(arraySorted(arr)) return true;
            else{
                // Otherwise rotate array once and continue checking
                arr = rotateArray(arr);
                x = x+1;
            }
        }
        // If we've tried all rotations and none work, return false
        return false;
    }

    /**
     * Rotates array one position to the left
     * @param arr Array to rotate
     * @return Rotated array
     */
    private int[] rotateArray(int[] arr){
        // Store first element
        int temp = arr[0];
        // Shift all elements one position left
        for(int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        // Place first element at end
        arr[arr.length-1] = temp;
        return arr;
    }

    /**
     * Checks if array is sorted in ascending order
     * @param arr Array to check
     * @return true if array is sorted, false otherwise
     */
    private boolean arraySorted(int[] arr){
        // Check each adjacent pair of elements
        for(int i=1; i<arr.length; i++){
            // If any element is smaller than previous, array is not sorted
            if(arr[i]<arr[i-1]) return false;
        }
        // If we get here, array is sorted
        return true;
    }
}
