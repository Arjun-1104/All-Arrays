import java.util.ArrayList;
import java.util.Arrays;

/* 
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        list.add(3, 40);

        System.out.println(list);

        int t = list.get(3);
        System.out.println(list);
        System.out.println(t);

        list.remove(list.size()-1);

        System.out.println(list);

        System.out.println(list.get(2));

        int k = list.get(2);
        list.remove(2);
        System.out.println(list);
        list.add(k);
        System.out.println(list);

        list.set(1, 46);
        System.out.println(list);

        System.out.println(list.size());

        list.clear();
        System.out.println(list);

        System.out.println(list.isEmpty());

        System.out.println(list.contains(45));

        list.add(45);
        list.add(46);
        list.add(47);
        list.add(48);
        list.add(46);
        list.add(50);

        System.out.println(list);

        System.out.println(list.indexOf(46));
        System.out.println(list.lastIndexOf(46));

        System.out.println(list);

        int[] arr = new int[list.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }

        System.out.println(Arrays.toString(arr));

        // remove from and index

        // list.remove(1);

        // get

        // int ele = list.get(2);

        // int els = list.set(5,45);

        // list.size();

        // list.clear();

        // list.contains(56);

        // list.isEmpty();

        // list.indexOf(5);

    }
}
*/
    // two value add
/*  
    public class Main {
    public static void main(String[] args) {
    int[] arr = {2, 7, 4, 3, 1, 9};
    int k = 8;
    
    
    for (int i = 0; i < arr.length; i++) {
    for (int j = i + 1; j < arr.length; j++) {
    if (arr[i] + arr[j] == k) {
    System.out.print(i + " " + j);
    break;
    }
    }
    }
    }
    }
    
    //merge to sorted array
    public class Main {
    public static void main(String[] args) {
    int[] arr = {3,9,10,15,16,17};
    int[] arr2 = {1,4,5,6,7,8};
    
    int[] res = new int[arr.length + arr2.length];
    
    int p1 = 0;
    int p2 = 0;
    int p3 = 0;
    
    while(p3<res.length){
    int val1 = p1<arr.length ? arr[p1]:Integer.MAX_VALUE;
    int val2 = p2<arr2.length? arr2[p2]:Integer.MAX_VALUE;
    
    if(val1<val2){
    res[p3] = val1;
    p3++;
    p1++;
    }
    else{
    res[p3] = val2;
    p3++;
    p2++;
    }
    }
    System.out.print(Arrays.toString(res));
    
    }
    }
    
    
    //check sorted
    public class Main {
    public static void main(String[] args) {
    int[] arr = {1,2,3,3,5,6,7};
    boolean flag = true;
    
    for(int i=1;i<arr.length;i++){
    if(arr[i-1]>arr[i]){
    flag = false;
    break;
    }
    }
    System.out.print(flag);
    }
    }
 */   


public class Main {
public static void main(String[] args) {
    

    int[] arr = {5,7,8,3,2,1} ;
    rotate(arr,arr.length);
}
 public static void rotate(int arr[], int n)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        
        
        for(int i=0;i<n;i++){
            list.add(arr[i]);
        }
        
        int last = list.get(list.size()-1);
        list.remove(list.size()-1);
        list.set(0,last);
        
        System.out.println(list.toString());
        
        
        
    }
}