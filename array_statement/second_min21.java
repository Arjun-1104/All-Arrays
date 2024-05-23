public class second_min21 {
    public static void main(String[] args) {
        int fmin = Integer.MAX_VALUE;
        int smin = 0;
        int[] arr = {12,45,-34,23,-7,11};

        for(int i=0;i<arr.length;i++){
            if(fmin>arr[i]){
                smin = fmin;
                fmin = arr[i];
            }
            else if(smin>arr[i]){
                smin = arr[i];
            }
        }
        System.out.println("First min: "+fmin);
        System.out.println("Second min: "+smin);
    }   
}
