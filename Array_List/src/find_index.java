
import java.util.ArrayList;

public class find_index {

    public static void main(String[] args) {
    int k = 65;
    
    ArrayList<Integer> list = new ArrayList<>();
    
    list.add(45);
    list.add(65);
    list.add(23);
    list.add(78);
    list.add(24);
    list.add(39);

    for(int i=0;i<list.size();i++){
        if(list.get(i) == k){
            System.out.println(i);
        }
    }
    
}
}