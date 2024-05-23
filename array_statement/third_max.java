public class third_max {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int tmax = Integer.MAX_VALUE;
        int smax=0;
        int[] arr = {45,67,89,32,13,63,98,78,90};

        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                smax = max;
                max = arr[i];
            }
            else if(smax<arr[i]){
                tmax = smax;
                smax = arr[i];
            }
            else if(tmax<arr[i]){
                tmax = arr[i];
            }
        }
        System.out.println("First max: "+max);
        System.out.println("Second max: "+smax);
        System.out.println("Third max: "+tmax);

    }
}
