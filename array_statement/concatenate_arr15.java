public class concatenate_arr {
    public static void main(String[] args) {
        int[] arr1 = { 10, 20, 30, 40, 50, 70, 30, 40, 30, 60, 50 };
        int[] arr2 = { 3, 5, 6, 7 };
        int[] arr3 = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[i + arr1.length] = arr2[i];
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
