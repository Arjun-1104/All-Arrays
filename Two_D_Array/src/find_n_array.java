/* 
public class find_n_array { 
        public static void main(String[] args) {
            int[][] arr = {{1,2,3},
                            {4,7,6},
                            {7,8,9}};
            int k = 5;
            boolean flag = false;
            for(int j=0;j<arr[0].length;j++){
                for(int i=0;i<arr.length;i++){
                
                if(arr[j][i]==k && flag==false){
                    System.out.println(i+" "+j);
                    flag = true; 
                }
            }
        }
        System.out.println(flag); 
    }
}
*/
public class find_n_array {
    public static boolean searchMatrix(int[][] matrix, int target){
        int r = 0;
        int c = matrix[0].length-1;

        while(r<matrix.length && c>=0){
            if(target == matrix[r][c]){
                return true;
            }
            else if(target > matrix[r][c]){
                r++;
            }
            else if(target < matrix[r][c]){
                c--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        int k = 5;
        boolean ans = searchMatrix(arr,k);
        System.out.println(ans);
    } 
}

    
