/*public class column_wise_arr {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        for(int j=0;j<arr[0].length;j++){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
*/
/* 
public class column_wise_arr {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};

        for(int j=0;j<arr[0].length;j++){

            if(j%2==0){

            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i][j]+" ");
            }
        }
            else{
                for(int i = arr.length-1;i>=0;i--){
                    System.out.println(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    
}
}
*/
public class column_wise_arr {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}
        };
    
        for(int col=0;col<arr[0].length;col++){
            for(int row=0;row<arr.length;row++){
                System.out.print(arr[row][col]+" ");
            } 
        }
    }
    
}