
// Problem: Find the second largest element in an array
// Time Complexity: O(n), where n is the length of the array
// Space Complexity: O(1), using only constant extra space

public class Problem2 {
    class Solution {
        public int getSecondLargest(int[] arr) {
            // Initialize the largest element with first array element
            int largest = arr[0];
            
            // First pass: Find the largest element in the array
            for(int i: arr){
                if(largest < i) largest = i;
            }
            
            // Initialize second_largest with -1 (will be returned if no second largest exists)
            int second_largest = -1;
            
            // Second pass: Find the largest element that is different from the largest element
            for(int i: arr){
                if(second_largest < i && i != largest) second_largest = i;
            }
            
            // Return the second largest element (or -1 if not found)
            return second_largest;
        }
    }
}

