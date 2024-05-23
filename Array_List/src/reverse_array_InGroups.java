import java.util.ArrayList;

public class reverse_array_InGroups {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(61);
        arr.add(69);
        arr.add(47);
        arr.add(87);
        arr.add(6);
        arr.add(7);
        arr.add(61);

        int n = arr.size();.
        int k = 3;
        Solution ob = new Solution();
        ob.reverseInGroups(arr, n, k);
    }
}

class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        
        if(k>=n-1){
            reverse(arr,0,n-1);
        }
        else{
            int st = 0;
            int end = k-1;
            
            while(end<n){
                reverse(arr,st,end);
                st= end -1;
                end = end + k;
            }
            reverse(arr,st,n-1);
        }
        
    }
    
        void reverse(ArrayList<Integer> arr,int st,int end){
            
            
            while(st<end){
                
                int s = arr.get(st);
                int e = arr.get(end);
                
                arr.set(end,s);
                arr.set(st,e);
                
                s++;
                e--;
                
            }
        }
    
}
