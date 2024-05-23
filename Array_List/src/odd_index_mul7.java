public class odd_index_mul7 {
    public static void main(String[] args) {
                int arr[] = {23,42,46,86,79,85,45};
                int mul = 1;

                for (int i = 1; i < arr.length; i+=2) {
                    mul = mul * arr[i];
                }
                System.out.println("Even index sum is: "+mul);
            }
        }


