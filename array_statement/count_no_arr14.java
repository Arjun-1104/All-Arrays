public class count_no_arr {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,70,30,40,30,60,50};
        int n=30;
        int count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                count++;
            }
        }
        System.out.println(count);
    }
}
