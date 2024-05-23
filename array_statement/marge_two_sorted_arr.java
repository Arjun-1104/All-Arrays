import java.util.*;

public class marge_two_sorted_arr {
    public static void main(String[] args) {
        int[] arr1 = {4,6,7,8,9};
        int[] arr2= {1,2,3,4,5};

        int[] arr3 = new int[arr1.length + arr2.length];
        int p1=0;
        int p2=0;
        int p3=0;

        while(p3<arr3.length){
            int val1 = p1<arr1.length ? arr1[p1]:Integer.MAX_VALUE;
            int val2 = p2<arr2.length ? arr2[p2]:Integer.MAX_VALUE;

            if(val1<val2){
                arr3[p3] = val1;
                p3++;
                p1++;

            }else{
                arr3[p3] = val2;
                p3++;
                p2++;
            }
        }
        System.out.println(Arrays.toString(arr3));

    }
}
