/*
public class sum_two_arr11 {
    public static void main(String[] args) {
        int[] arr = {6,2,5,7,9,8};
        int[] arr2 = {3,2,3,9};
        int n = Math.max(arr.length, arr2.length);
        int[] arr3 = new int[n+1];
        int rem=0,bhag=0;

        int i = 1;
        for(;i<=n;i++){
            if(arr.length-i>=0 && arr2.length-i>=0) {
                arr3[arr3.length - i] = arr[arr.length - i] + arr2[arr2.length - i] + bhag;
            }
            else if(arr.length-i<0){
                arr3[arr3.length-i] = arr2[arr2.length-i] + bhag;
            }
            else if(arr2.length-i<0){
                arr3[arr3.length-i] = arr[arr.length-i] + bhag;
            }



            //if(arr3[arr3.length-i]> 10){
                 rem = arr3[arr3.length-i] % 10;
                 bhag = arr3[arr3.length-i] / 10;
                 arr3[arr3.length-i] = rem;

           // }
        }
        arr3[arr3.length-i] =arr3[arr3.length-i] + rem;
        for(int a=0;a<arr3.length;a++){
            System.out.print(arr3[a]+" ");
        }

    }
}
*/
/*
public class sum_two_arr11 {
    public static void main(String[] args) {
        int[] arr = {2,5,7,6,8};
        int[] arr2 = {2,3,9,7,0};
        int[] arr3 = new int[arr.length+1];
        int rem=0,bhag=0;
        for(int i=1;i<=arr.length;i++){

            arr3[arr3.length-i] = arr[arr.length-i] + arr2[arr2.length-i]  + bhag;

            rem = arr3[arr3.length-i] % 10;
            bhag = arr3[arr3.length-i] / 10;
            arr3[arr3.length-i] = rem;

        }
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }

    }
}
*/