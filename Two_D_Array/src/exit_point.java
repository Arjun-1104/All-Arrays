import java.util.Arrays;

public class exit_point {
    public static void main(String[] args) {
        int[][] arr = {
                { 0, 1, 0, 1 },
                { 1, 0, 1, 1 },
                { 0, 1, 1, 1 },
                { 0, 0, 1, 0 }
        };

        int r = 0;
        int c = 0;
        int d = 0;

        while (true) {

            d = ((d + arr[r][c]) % 4);
            arr[r][c] = 0;

            if (d == 0) {
                c++;
            } else if (d == 1) {
                c--;
            } else if (d == 3) {
                r--;
            }

            if (r < 0) {
                r++;
                break;
            } else if (c < 0) {
                c++;
                break;
            } else if (c == arr[0].length) {
                c--;
                break;
            }
        }

        int[] ans = new int[2];
        ans[0] = r;
        ans[1] = c;

        System.out.println(Arrays.toString(ans));

    }
}
