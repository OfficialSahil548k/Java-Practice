package ArrayList;
import java.util.ArrayList;
public class _4 {
    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;
        int lp = 0; // 1st pointer
        int rp = height.size()-1; // 2nd pointer
        while(lp<rp){
            // get maxWater
            int hght = Math.min(height.get(lp),height.get(rp));
            int wdth = rp - lp;
            int currWater = hght * wdth;
            maxWater = Math.max(maxWater,currWater);

            // Update pointers
            if(lp<rp){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
    }
}
