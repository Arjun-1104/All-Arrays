public class Second_max20 {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 9 };

        int max = Integer.MIN_VALUE;
        int smax = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                smax = max;
                max = arr[i];
            } else if (smax < arr[i]) {
                smax = arr[i];
            }
        }

        System.out.println(max);
        System.out.println(smax);
    }
}
