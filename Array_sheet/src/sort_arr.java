
/*public class sort_arr {
    public static void main(String[] args) {
        int[] arr = {5,6,9,1,7,8,3};
        int max = Integer.MIN_VALUE;
        int s=0;
        for(int i=1;i<arr.length;i++){
            if(arr[s]>arr[i]){
                int k = arr[s];
                arr[s] = arr[i];
                arr[i] = k;
                i=1;
                s=0;
            }
            s++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
    }
}
*/
/* 
import java.util.Arrays;

public class sort_arr {
    public static void main(String[] args) {
        int[] arr = { 10, 6, 8, 3, 9, 1 };
         int j = 1;
        for (int i = 0; i < arr.length - j; i++) {
            if (arr[i] > arr[i + 1]) {
                int k = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = k;
            }
            if (i == arr.length - (j + 1)) {
                i = 0;
                j++;
            }

        }

        System.out.println(Arrays.toString(arr));
    }

}
*/

import java.util.Arrays;

public class sort_arr {
    public static void main(String[] args) {
        int[] arr = { 10, 6, 8, 3, 9, 1 };

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

                if(arr[i] >= arr[j]){
                    int k = arr[i];
                    arr[i]=arr[j];
                    arr[j]=k;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

            // for(int i=0;i<arr.length;i++){
                // System.out.print(arr[i]+" ");
        // }
    }
}
