package Arrays.Easy;

// Find largest element in an array

// This class contains a solution to find the largest element in an array
class Solution {
    /**
     * Finds the largest element in an integer array
     * @param arr The input array to search through
     * @return The largest integer found in the array
     * 
     * Time Complexity: O(n) - where n is the length of the array
     * Space Complexity: O(1) - only uses a single variable for tracking max
     */
    public static int largest(int[] arr) {
        // Initialize answer variable to store the maximum value
        int answer = 0;
        
        // Iterate through each element in the array
        for(int i: arr){
            // If current element is larger than our current maximum,
            // update answer to store this new maximum
            if(answer < i) answer = i;
        }
        
        // Return the largest element found
        return answer;
    }
}
