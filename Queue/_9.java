package Queue;
import java.util.*;
public class _9 {
    public static void main(String[] args) {
        Deque<Integer> q = new LinkedList<>();
        q.addFirst(1);
        q.addFirst(2);
        q.addLast(3);
        q.addLast(4);
        System.out.println(q);
        q.removeFirst();
        q.removeLast();
        System.out.println(q);
    }

}
