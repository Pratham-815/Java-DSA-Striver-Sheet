package Arrays.Easy;

// Find second largest element in an array

public class Problem2 {
    class Solution {
        public int getSecondLargest(int[] arr) {
            int largest = arr[0];
            
            for(int i: arr){
                if(largest < i) largest = i;
            }
            
            int second_largest = -1;
            
            for(int i: arr){
                if(second_largest < i && i != largest) second_largest = i;
            }
            
            return second_largest;
        }
    }
}
