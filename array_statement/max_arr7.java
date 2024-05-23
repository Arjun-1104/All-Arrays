public class max_arr {
    public static void main(String[] args) {
        int[] arr2 = { 4, 6, 7, 8, 12, 43, 65 };
        int max = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (max < arr2[i]) {
                max = arr2[i];
            }
        }
        System.out.println(max);
    }
}
