import java.util.*;
public class transpose_matrix {
    public static void main(String[] args) {
        int[][] arr    ={{11,12,13,14}
                        ,{21,22,23,24}
                        ,{31,32,33,34}
                        ,{41,42,43,44}};
        
        for(int row=0;row<arr.length;row++){

            for(int col=row;col<arr[0].length;col++){
                int k = arr[row][col];
                arr[row][col] = arr[col][row];
                arr[col][row] = k;
            }
        }
        System.out.print(Arrays.deepToString(arr));
    }
}
