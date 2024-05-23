import java.util.*;
public class Reverse_each_row {
    public static void main(String[] args) {
        int[][] arr = {
            {11,12,13,14},
            {21,22,23,24},
            {31,32,33,34},
            {41,42,43,44}
        };

        for(int i=0;i<arr.length;i++){
            int[] temp = arr[i];
            reverseArray(temp);
        }
        System.out.println(Arrays.deepToString(arr));
    }

        public static void reverseArray(int[] arr){
            int start = 0;
            int end = arr.length-1;
    
            while(start<end){
                int k = arr[start];
                arr[start] = arr[end];
                arr[end] = k;
                start++;
                end--;
            }
        }
    }

