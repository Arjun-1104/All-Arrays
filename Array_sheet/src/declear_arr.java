public class declear_arr {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int arr2[];

        int arr3[] = {1,2,3,4,5};
        int[] arr4 = {1,2,3,4,5};

        System.out.println(arr4[4]);
        arr4[4] = 65;
        System.out.println(arr4[4]);
        System.out.println(arr4.length);

        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }
    }
}
