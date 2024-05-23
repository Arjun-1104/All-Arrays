public class col_smallest_sum {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };

        int lowline = 0;
        int temp = Integer.MAX_VALUE;

        for (int col = 0; col < arr[0].length; col++) {
            int sum = 0;
            for (int row = 0; row < arr.length; row++) {
                sum = sum + arr[row][col];
            }
            if (sum < temp) {
                temp = sum;
                lowline = col;
            }
        }
        System.out.println(temp + " " + lowline);
    }
}
