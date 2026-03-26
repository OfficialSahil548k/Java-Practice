package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class _2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(7);
        list.add(1);
        list.add(8);
        list.add(6);

        int idx = 0;
        for(int i=0; i<list.size(); i++){
            if(list.get(i)>list.get(idx)){
                idx = i;
            }
        }
        System.out.println(list);
        System.out.println("Maximum element in list is : " + list.get(idx));
        Collections.sort(list); // ascending order
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder()); // descending order
        System.out.println(list);
    }
}
