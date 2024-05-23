public class min_element {
        public static void main(String[] args) {
            int[][] arr = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 }
        };
        int min = Integer.MAX_VALUE;
    
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[0].length;j++){
                    if(min > arr[i][j]){
                        min = arr[i][j];
                    }
                }
            }
            System.out.println("Minimunm is: "+min);
        }
    }
    

