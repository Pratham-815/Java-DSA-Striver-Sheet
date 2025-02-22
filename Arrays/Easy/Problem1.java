package Arrays.Easy;

// Find largest element in an array

class Solution {
    public static int largest(int[] arr) {
        int answer = 0;
        for(int i: arr){
            if(answer<i) answer = i;
        }
        return answer;
    }
}
