package Stack;
import java.util.Stack;
public class _6 {
    public static void main(String[] args) {
        int nums[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nextGrt[] = new int[nums.length];
        for(int i=nums.length-1; i>=0; i--){
            while(!s.isEmpty() && nums[s.peek()]<= nums[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGrt[i] = -1;
            }
            else{
                nextGrt[i] = nums[s.peek()];
            }
            s.push(i);
        }
        for(int i=0; i<nextGrt.length; i++){
            System.out.print(nextGrt[i]+" ");
        }
    }
}
