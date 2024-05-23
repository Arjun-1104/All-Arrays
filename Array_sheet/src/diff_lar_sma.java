public class diff_lar_sma {
    public static void main(String[] args) {
        int arr[] = {13,45,32,58,76,19,87,90};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("max: "+max+" "+"min: "+min);
        System.out.print("difference: "+ (max-min));
    }
}
