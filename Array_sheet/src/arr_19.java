public class arr_19 {
    public static void main(String[] args) {
        int[] arr = {4,6,8,7,10,2};
        int k = 14;
        int count=0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == k){
                    System.out.println(i+" "+j);
                    count++;
                }
            }
        }
        System.out.println("Count is: "+count);
    }
}
