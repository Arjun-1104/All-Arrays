public class remove_element {
    public static void main(String[] args) {
        int arr[] = {1,4,6,8,7};
        int[] arr2 = new int[arr.length-1];
        int k = 4;
        int itr = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] != k){
                arr2[itr] = arr[i];
                itr++;
            }

        }
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]+" ");
        }
    }
}
