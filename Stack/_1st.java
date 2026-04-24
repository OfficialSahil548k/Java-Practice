package Stack;
import java.util.ArrayList;

public class _1st {
    public static class StackA{
        static ArrayList<Integer> list = new ArrayList<>();

        // isEmpty
        public static Boolean isEmpty(){
            if(list.size()==0){
                return true;
            }
            return false;
        }

        //push
        public static void push(int data){
            list.add(data);
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peak
        public static int peek(){
            if(isEmpty()){
                return -1;
            }            
            return list.get(list.size()-1);
        }

    }
    public static void main(String[] args) {
        StackA s = new StackA();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
