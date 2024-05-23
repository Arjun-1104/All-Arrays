public class first_last {
    public static void main(String[] args) {
        int arr[] = {10,20,30,50,40,60,30,90,30,70};
        int k=30;
        int fi = -1;
        int li = -1;
        boolean flag = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] == k && flag){
                fi = i;
                li = i;
                flag = false;
            }
            else if(arr[i] == k){
                li = i;
            }
        }
        System.out.print(fi+" "+li);
    }
}
