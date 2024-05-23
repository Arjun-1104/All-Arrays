public class cheak_same {
    public static void main(String[] args) {
        int[][] arr1 = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };

        int[][] arr2 = { { 1, 2, 3, 4, 5 }, { 7, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };

        boolean flag = true;
        if ((arr1.length == arr2.length) && (arr1[0].length == arr2[0].length)) {

            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
                    if (arr1[i][j] != arr2[i][j]) {
                        flag = false;
                    }
                }
            }
        } else {
            flag = false;
        }
        System.out.println(flag);

    }
}
