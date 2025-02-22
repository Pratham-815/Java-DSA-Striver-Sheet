package Arrays.Easy;

// Solution to check if an array can be sorted by rotation

public class Problem3 {
    public boolean check(int[] arr){
        int x = 0;
        while(x <= arr.length){
            if(arraySorted(arr)) return true;
            else{
                arr = rotateArray(arr);
                x = x+1;
            }
        }
        return false;
    }


    private int[] rotateArray(int[] arr){
        int temp = arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        return arr;
    }


    private boolean arraySorted(int[] arr){
        for(int i=1; i<arr.length; i++){
            if(arr[i]<arr[i-1]) return false;
        }
        return true;
    }
}
