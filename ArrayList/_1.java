package ArrayList;
import java.util.ArrayList;
public class _1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        // get elements
        int el = list.get(2);
        System.out.println(el);

        // DELETE
        list.remove(2);
        System.out.println(list);

        // set
        list.set(2,3);
        System.out.println(list);

        //contains
        System.out.println(list.contains(2));
        System.out.println(list.contains(5));

        //print list
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //print reverse list
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
