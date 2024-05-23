
import java.util.ArrayList;

public class common_element_bw_2arr9 {
    public static void main(String[] args) {

        int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,8,9,2,4,9};
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i = 0; i<arr1.length; i++){
            int ele = arr1[i];
            list1.add(ele);
        }
        System.out.println(list1);
        for(int i = 0; i<arr2.length; i++){
            int ele = arr2[i];
            list2.add(ele);
        }
        System.out.println(list2);
        for(int i = 0; i<list1.size(); i++){
            for(int j = 0; j<list2.size(); j++){
                if(list1.get(i)==list2.get(j)){
                    System.out.println(list1.get(i));
                }
            }
        }
    }
}