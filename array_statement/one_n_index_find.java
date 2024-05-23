/* 
public class one_n_index_find {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,70,30,40,30,60,50};
        int n=30;
        int fi = -11;
        int si = -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                fi = i;
                break;
            }
            
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==n){
                si = i;
                break;
            }
        }
        System.out.print(fi+ " " + si);

    }
}
*/
/* 
public class one_n_index_find {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,70,30,40,30,60,50};
        int n=30;
        int fi = -1;
        int si = -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                fi = i;
            }
            
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==n){
                si = i;
            }
        }
        System.out.print(fi+ " " + si);

    }
}
*/
public class one_n_index_find {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,70,30,30};
        int n = 30;
        int fi = -1;
        int li = -1;
        boolean flag = true;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==n && flag == true){
                fi = i;
                li = i;
                flag = false;
            }
            else if(arr[i] == n){
                li = i;
            }
        }
      
        System.out.print(fi+ " " + li);

    }
}


