public class bar_chart {

    public static void main(String[] args) {
        
        int[] arr = {4,3,1,6,2,5};
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }

        for(int level=max;level>=1;level--){
            for(int i=0;i<arr.length;i++){
                if(level<=arr[i]){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}