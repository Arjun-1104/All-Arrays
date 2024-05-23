public class count_no_arr {
    public static void main(String[] args) {
        int arr[] = {12,43,30,56,43,30,23,76,89,30};
        int k=30;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == k){
                count++;
            }
        }
        System.out.print(count);
    }
}
