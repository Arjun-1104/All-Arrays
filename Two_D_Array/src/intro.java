import java.util.Arrays;

public class intro {
    public static void main(String[] args) {
    //    int[][] arr = new int[3][3]; // declear 2d-array
        
        int[][] arr2 = { // inisialize 2d-array
            {1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}
        };
        int[] a = {21,22,23,24,25};
        int[] b = {26,27,28,29,30};
        int[] c = {31,32,33,34,35};
        int[][] res = {a,b,c};
        
        // specific values declear

      //  System.out.println(arr2[2][3]);
      //  System.out.println(res[1][3]);

      // access an element in 2d-array

        for(int i=0;i<arr2.length;i++){
            int[] temp = arr2[i];
            for(int j=0;j<temp.length;j++){
                System.out.print(arr2[i][j]+" ");
            }
        }
        System.out.println(Arrays.deepToString(arr2));

        // int sum =0;
        // for(int i=0;i<arr2.length;i++){
            // for(int j=0;j<arr2[i].length;j++){
                //  sum  = sum + arr2[i][j];
            //   System.out.println(arr2[i][j]);
                // 
            // }
            // 
        // }
        // System.out.println(sum);
        // System.out.println(res.length);
        // System.out.println(res[0].length);
    }

}

