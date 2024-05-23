
import java.util.ArrayList;

public class count_even_arr1 {

    public static void main(String[] args) {
        int count=0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(65);
        list.add(23);
        list.add(78);
        list.add(24);
        list.add(39);

        for(int i=0;i<list.size();i++){
            if(list.get(i)%2 == 0){
                count++;
            }
        }
        System.out.println(count);

    }
}