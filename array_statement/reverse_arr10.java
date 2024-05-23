public class reverse_arr {
    public static void main(String[] args) {
        int arr[] = {10,3,5,6,7,8};
        int res[] = new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            res[arr.length-1-i] = arr[i];

        }

        for(int i=0;i<res.length;i++){
            System.out.print(res[i] + " ");
        }
    }
}
