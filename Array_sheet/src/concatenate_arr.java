public class concatenate_arr {
    public static void main(String[] args) {
        int arr[] = {2,4,6,3,6,5,8,7,8,1};
        int arr2[] = {23,45,67,89,12};
        int arr3[] =new int[arr.length+arr2.length];

        for(int i=0;i<arr.length;i++){
            arr3[i] = arr[i];

        }
        for(int i=0;i<arr2.length;i++){
            arr3[arr.length+i] = arr2[i];
        }
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
    }
}
