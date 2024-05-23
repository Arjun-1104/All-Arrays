public class index_find_Arr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n=7;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println("index : "+i);
            }
        }
        System.out.println("Invaid number");
    }
}
