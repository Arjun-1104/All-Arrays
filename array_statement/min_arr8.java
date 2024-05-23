public class min_arr {
    public static void main(String[] args) {
        int[] arr2 = { -2, -1, -10, -100 };

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr2.length; i++) {
            if (min > arr2[i]) {
                min = arr2[i];
            }
        }
        System.out.println(min);
    }
}