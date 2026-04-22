package LinkedList;
import java.util.LinkedList;

public class Merge_Sort {
 public static LinkedList<Integer> mergeSort(LinkedList<Integer> list) {
        // base case
        if (list.size() <= 1) {
            return list;
        }

        int mid = list.size() / 2;

        // split list
        LinkedList<Integer> left = new LinkedList<>(list.subList(0, mid));
        LinkedList<Integer> right = new LinkedList<>(list.subList(mid, list.size()));

        // recursive sort
        left = mergeSort(left);
        right = mergeSort(right);

        // merge
        return merge(left, right);
    }

    public static LinkedList<Integer> merge(LinkedList<Integer> left, LinkedList<Integer> right) {
        LinkedList<Integer> result = new LinkedList<>();

        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                result.add(left.get(i++));
            } else {
                result.add(right.get(j++));
            }
        }

        // remaining elements
        while (i < left.size()) {
            result.add(left.get(i++));
        }

        while (j < right.size()) {
            result.add(right.get(j++));
        }

        return result;
    }

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(5);
        ll.add(3);
        ll.add(8);
        ll.add(1);
        ll.add(2);

        ll = mergeSort(ll);

        System.out.println(ll);
    }
}


// NOTE :- This is not optimal time complexity ~ O(n). Instead use Customzized LinkedList.