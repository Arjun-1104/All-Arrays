public class even_index_sum6 {
    public static void main(String[] args) {
        int arr[] = {23,42,46,86,79,85,45};
        int sum = 0;

        for (int i = 0; i < arr.length; i+=2) {
            sum = sum + arr[i];
        }
        System.out.println("Even index sum is: "+sum);
    }
}
