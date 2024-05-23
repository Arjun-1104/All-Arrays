/*public class row_largest_sum {
    public static void main(String[] args) {
        
    
    int[][] arr = {{1,2,3},
                   {4,5,6},
                   {7,8,9}};
    
        int sum = Integer.MIN_VALUE;
        int maxRow = 0;
        for(int i=0;i<arr[0].length;i++){
            int tempsum = 0;
            for(int j=0;j<arr.length;j++){
        
            sum = sum + arr[i][j];
        }
        if(tempsum > sum){
            sum = tempsum;
            maxRow = i;
        } 
    }

        System.out.println(sum +" "+maxRow);
    }
}   
*/
public class row_largest_sum {
    public static void main(String[] args) {
        
    
    int[][] arr = {{1,2,3},
                   {4,5,6},
                   {7,8,9}};

    
    int maxline = 0;
    int temp = 0;
    for(int row=0;row<arr.length;row++){
         int sum = 0;
        for(int col=0;col<arr[0].length;col++){
             sum = sum + arr[row][col];
        }
        if(sum>temp){
            temp = sum;
            maxline = row;
        }
    }
    System.out.println(temp+" "+maxline);
    }    
}
  

