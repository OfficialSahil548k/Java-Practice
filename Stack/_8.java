package Stack;
import java.util.Stack;
public class _8 {
    public static void maxArea(int[] heights){
        int max = 0;
        int nsl[] = new int[heights.length];
        int nsr[] = new int[heights.length];

        //next smaller right
        Stack<Integer> s = new Stack<>();
        for(int i=heights.length-1; i>=0; i--){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = heights.length;
            }
            else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        //next smaller left
        s = new Stack<>();
        for(int i=0; i<heights.length; i++){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1 ;
            }
            else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // current area
        for(int i=0; i<heights.length; i++){
            int hght = heights[i];
            int wdth = nsr[i]-nsl[i]-1;
            int area = hght*wdth;
            if(area>max){
                max = area;
            }
        }

        System.out.println("maximum area of histogram is : "+ max);

    }
    public static void main(String[] args) {
        int heights[] = {2, 1, 5, 6, 2, 3};
        maxArea(heights);
    }
}
