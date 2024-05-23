public class second_min {
    public static void main(String[] args) {
        int arr[] = {12, 45, 76, 89, 34, 76, 25, 90, 45, 21};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                max = min;
                min = arr[i];
            } else if (max > arr[i]) {
                max = arr[i];
            }
        }
        System.out.print("First min: " + min + " " + "Second min: " + max);
    }
}
