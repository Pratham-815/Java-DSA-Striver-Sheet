import java.util.Arrays;

/**
 * LeetCode 31: Next Permutation
 * Time Complexity: O(n) where n is the length of the array
 * Space Complexity: O(1) - only using constant extra space
 */
public class LeetCode_31{
    public void nextPermutation(int[] nums) {
        // Step 1: Find the largest index i such that nums[i] < nums[i+1]
        // This identifies the "pivot" position where we need to make a change
        int index = -1;
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }

        // Step 2: If no such index exists, the array is in descending order
        // This means it's the last permutation, so return the first permutation
        if(index == -1){
            Arrays.sort(nums);
            return;
        }

        // Step 3: Find the largest index j such that nums[j] > nums[index]
        // This gives us the smallest number greater than nums[index] to swap with
        for(int i=nums.length-1; i>index; i--){
            if(nums[i] > nums[index]){
                swap(nums, i, index);
                break;
            }
        }

        // Step 4: Reverse the elements after index to get the next lexicographically larger permutation
        reverseArray(nums, index+1, nums.length-1);
    }

    /**
     * Swaps two elements in the array
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    /**
     * Reverses elements in array from start to end index (inclusive)
     * Time Complexity: O(n) where n is the number of elements to reverse
     * Space Complexity: O(1)
     */
    public void reverseArray(int[] nums, int start, int end){
        while(start < end){
            swap(nums, start++, end--);
        }
    }
}