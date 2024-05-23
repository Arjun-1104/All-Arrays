import java.util.Arrays;

public class access_arr {
    public static void main(String[] args) {

        int[][] arr2 = { // inisialize 2d-array
            {1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}
        };

        for(int i=0;i<arr2.length;i++){
            int[] temp = arr2[i];

            for(int j=0;j<temp.length;j++){

         //   System.out.print(arr2[i][j]+" ");
        }
    }
        System.out.println(Arrays.deepToString(arr2));
    }
    
}
