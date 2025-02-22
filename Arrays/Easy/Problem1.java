package Arrays.Easy;

class Solution {
    public static int largest(int[] arr) {
        int answer = 0;
        for(int i: arr){
            if(answer<i) answer = i;
        }
        return answer;
    }
}
