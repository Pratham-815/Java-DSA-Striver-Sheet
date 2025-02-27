/**
 * LeetCode 169 - Majority Element
 * Given an array nums, find the majority element that appears more than n/2 times.
 * 
 * Solution approach (Boyer-Moore Voting Algorithm):
 * 1. Find potential majority element by:
 *    - When frequency is 0, pick current element as candidate
 *    - Increment frequency for matching elements, decrement for non-matching
 * 2. Verify the candidate appears more than n/2 times
 * 3. Return candidate if verified, -1 if no majority element exists
 *
 * Time Complexity: O(n) - Two passes through the array
 * Space Complexity: O(1) - Only using two variables (freq and ans)
 */
public class LeetCode_169 {
    public int majorityElement(int[] nums) {
        // Initialize frequency counter and potential answer
        int freq = 0;
        int ans = 0;

        // First pass: Find potential majority element
        for(int i=0; i<nums.length; i++){
            // When frequency becomes 0, current element becomes new candidate
            if(freq==0){
                ans = nums[i];
            }
            // If current element matches our candidate, increase its frequency
            if(ans==nums[i]){
                freq = freq + 1;
            }
            // If current element differs from candidate, decrease frequency
            // This represents "cancelling out" pairs of different elements
            else{
                freq = freq - 1;
            }
        }

        // Second pass: Verify if potential answer appears more than n/2 times
        int count = 0;
        for(int i=0; i<nums.length; i++){
            // Count exact occurrences of our candidate
            if(ans == nums[i]) count++;
        }

        // Return answer if it's a majority element (appears > n/2 times)
        // Otherwise return -1 indicating no majority element exists
        if(count > (nums.length)/2) return ans;
        else return -1;
    }
}
