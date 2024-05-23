public class reverse_arr2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int start=0,end=arr.length-1;
        
        while(start<end){

            int k = arr[start];
            arr[start] = arr[end];
            arr[end] = k;

            start++;
            end--;
        }   
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}   

