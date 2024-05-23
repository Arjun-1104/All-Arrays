public class find_index {
    public static void main(String[] args) {
        int arr[] = {1,5,4,7,9,4,5};
        int k = 4;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] == k){
                System.out.print(i+" ");

            }
        }
    }
}
