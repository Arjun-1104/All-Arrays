/* 
public class remove_duplicate5 {
    public static void main(String[] args) {
        int arr[] = {23,54,67,89,23,45,65,23};
        int[] arr2 = new int[arr.length];
        int k = 23;
        int itr = 0;
        boolean flag = true;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == k && flag==true){
                arr2[itr] = arr[i];
                itr++;
                flag = false;
            }
            else if(arr[i] != k){
                arr2[itr] = arr[i];
                itr++;
            }
        }
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
*/

import java.util.ArrayList;

public class remove_duplicate5 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list.add(45);
        list.add(56);
        list.add(67);
        list.add(45);
        list.add(82);
        list.add(45);

        int itr = 0;
        boolean flag = true;
        int k = 45;

        for(int i=0;i<list.size();i++){
            if(list.get(i) == k && flag==true){
                int a  = list.get(i);
                list2.add(itr,a);
                itr++;
                flag = false;
            }
            else if(list.get(i) != k){
                int b = list.get(i);
                list2.add(itr,b);
                itr++;
            }

        }
        System.out.print(list2);
    }
}