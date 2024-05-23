/* 
public class check_ascending {
    public static void main(String[] args) {
        int[] arr = {4,6,8,10,23,34,54};
        boolean flag = true;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i] < arr[i+1] && flag){
                flag = true;
            }
            else{
                flag = false;
            }
        }
        System.out.print(flag);
    }
}
*/
// use of array

import java.util.ArrayList;

public class check_ascending{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(56);
        list.add(67);
        list.add(78);
        list.add(82);
        list.add(93);

        boolean flag = true;
        for(int i=0;i<list.size()-1;i++){
            if((list.get(i) > list.get(i+1)) && flag){
                flag = false;
            }
        }
        System.out.println(flag);
    }
}
