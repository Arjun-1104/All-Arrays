public class remove_element_arr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr2 = new int[arr.length-1];
        int n = 2;
        int itr = 0;
        for(int i=0;i<arr.length;i++){
            if(n!=arr[i]){
                 arr2[itr] = arr[i];
                 itr++;
            } 
           // System.out.println(arr2[itr]);
            //System.out.println(arr[i]);
        }
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
        

    }
}
