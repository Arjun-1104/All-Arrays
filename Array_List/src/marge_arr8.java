/*
public class marge_arr8 {
    public static void main(String[] args) {
        int[] arr = {1,15,17};
        int[] arr2 = {2,13,27};
        int[] arr3 = new int[arr.length+ arr2.length];
        int a = 0;
        int b = 0;

        for(int i=0;i<arr3.length;i++){
            if(a>=arr.length){
                a = arr.length ;

            }
            if(b>=arr2.length){
                b = arr2.length;
            }
            if(a != arr.length && b != arr2.length && arr[a] == arr2[b]){
                arr3[i] = arr[a];
                a++;

            }
             else if (a != arr.length && arr[a] < arr2[b]  ) {
                    arr3[i] = arr[a];
                    a++;
                }

             else if (b != arr2.length && arr[a] > arr2[b] ) {
                    arr3[i] = arr2[b];
                    b++;
                }


        }
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }


    }

}
*/

public class marge_arr8 {
    public static void main(String[] args) {
        int[] arr = {1,15,17,44,50,54,55,56,70};
        int[] arr2 = {2,13,27,45,69};
        int[] arr3 = new int[arr.length+ arr2.length];
        int a=0,b=0;

        for(int i=0;i<arr3.length;i++){
            if(a<arr.length  && arr[a]<arr2[b]){
                arr3[i] = arr[a];
                a++;
            }
            else if(b<arr2.length) {
                arr3[i] = arr2[b];
                b++;
            }
        }
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
    }
}



