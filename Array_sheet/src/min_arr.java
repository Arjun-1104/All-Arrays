public class min_arr {
    public static void main(String[] args) {
        int[] arr = {9,1,4,6,3,3};
        int min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
