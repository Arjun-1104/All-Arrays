public class average {
    public static void main(String[] args) {
        int[][] arr2 = {
            {1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}
        };
        int element = arr2.length * arr2[0].length;
        int sum =0;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                 sum  = sum + arr2[i][j];
              }
        }
        System.out.println("sum is: "+sum);
        System.out.println("Average is: "+(float)sum/element);
    }
}
