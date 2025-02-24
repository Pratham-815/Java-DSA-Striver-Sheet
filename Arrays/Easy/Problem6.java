
// Solution to move all zeroes to the end of Array

public class Problem6{
    public void moveZeroess(int[] nums){
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0) count = count + 1;
        }

        int j = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j = j + 1;
            }
        }

        for(int i = nums.length - count; i<nums.length; i++){
            numms[i] = 0;
        }
    }
}