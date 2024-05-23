public class second_max {
    public static void main(String[] args) {
        int arr[] = {12,45,76,89,34,76,25,90,45,21};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                min = max;
                max = arr[i];
            }
            else if(min<arr[i]){
                min = arr[i];
            }
        }
        System.out.print("First max: "+max+" "+"Second max: "+min);
    }
}
