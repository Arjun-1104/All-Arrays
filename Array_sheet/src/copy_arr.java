public class copy_arr {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,7,3,5};
        int[] arr2 = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            arr2[i] = arr[i];
        }

        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
