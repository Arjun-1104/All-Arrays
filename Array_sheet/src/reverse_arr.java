/*
public class reverse_arr {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int res[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            res[arr.length-1-i] = arr[i];
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }


    }
}
*/
public class reverse_arr {
    public static void main(String[] args) {
        int[] arr = {2,5,4,8,7};
        int s=0;
        int e = arr.length-1;

        for(int i=0;i<arr.length;i++){
            while(s<e){
                int k = arr[s];
                arr[s] = arr[e];
                arr[e] = k;

                s++;
                e--;
            }

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }

    }
}
