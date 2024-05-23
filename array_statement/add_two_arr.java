import java.util.Arrays;

public class add_two_arr {
    public static void main(String[] args) {
        int[] arr = { 7, 5, 6, 4, 3, 8 };
        int[] arr2 = { 8, 6, 5, 8, 2, 6, 4 };
        int l3 = Math.max(arr.length, arr2.length);
        int[] res = new int[l3];
        int p1 = arr.length - 1;
        int p2 = arr2.length - 1;
        int p3 = l3 - 1;
        int carry = 0;

        while (p1 >= 0 || p2 >= 0) {
            int val1 = p1 >= 0 ? arr[p1] : 0;
            int val2 = p2 >= 0 ? arr2[p2] : 0;

            int sum = val1 + val2 + carry;
            int d = sum % 10;
            carry = sum / 10;

            res[p3] = d;

            p3--;
            p2--;
            p1--;
        }
        int[] res2;
        if (carry == 1) {
            res2 = new int[res.length + 1];

            res2[0] = 1;

            for (int i = 0; i < res.length; i++) {
                res2[i + 1] = res[i];
            }

        } else {
            res2 = res;
        }
        System.out.println(Arrays.toString(res2));
    }

}
