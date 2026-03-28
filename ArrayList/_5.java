package ArrayList;
import java.util.ArrayList;
public class _5 {
    public static boolean pairSum(ArrayList<Integer> list, int target){
        // Brute Force ~ O(n^2)
        // for(int i=0; i<list.size(); i++){
        //     for(int j=i+1; j<list.size(); j++){
        //         if(list.get(i)+list.get(j)==target){
        //             return true;
        //         }
        //     }
        // }


        // 2 Pointer Approach ~ O(n)
    int n = list.size();

    // Step 1: Find pivot (breaking point)
    int bp = -1;
    for (int i = 0; i < n - 1; i++) {
        if (list.get(i) > list.get(i + 1)) {
            bp = i;
            break;
        }
    }

    // Step 2: Initialize pointers
    int lp = (bp + 1) % n; // smallest element
    int rp = bp;           // largest element

    // Step 3: Two pointer search
    while (lp != rp) {
        int curr = list.get(lp) + list.get(rp);

        if (curr == target) {
            return true;
        } else if (curr < target) {
            lp = (lp + 1) % n;
        } else {
            rp = (n + rp - 1) % n;
        }
    }


        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(pairSum(list, 16));
    }
}
