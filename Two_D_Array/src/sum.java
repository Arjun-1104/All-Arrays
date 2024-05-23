public class sum {
    
        public static void main(String[] args) {
        //    int[][] arr = new int[3][3];
            
            int[][] arr2 = {
                {1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}
            };
            int sum =0;
            for(int i=0;i<arr2.length;i++){
                for(int j=0;j<arr2[i].length;j++){
                     sum  = sum + arr2[i][j];
                  }
            }
            System.out.println(sum);
    }
}
