import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class max_arr {
    public static void main(String[] args) {
        /*
        int[] arr = {2,5,6,2};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
        */

        int[] arr = {2,5,4,8,7};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<=arr.length-1;i++){
            if(max<arr[i]){
                max = arr[i];
            }
            else if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println(max+" "+min);
    }
}
