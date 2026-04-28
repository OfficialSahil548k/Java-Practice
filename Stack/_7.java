package Stack;
import java.util.Stack;

public class _7 {
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            // Opening brackets
            if(ch=='(' || ch=='[' || ch=='{' || ch=='<'){
                s.push(ch);
            }
            // Closing brackets
            else {
                if(s.isEmpty()) return false;

                char top = s.peek();

                if((top=='(' && ch==')') ||
                   (top=='[' && ch==']') ||
                   (top=='{' && ch=='}') ||
                   (top=='<' && ch=='>')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }

   public static boolean isDuplicate(String str){
    Stack<Character> s = new Stack<>();
    for(int i=0; i<str.length(); i++){
        char ch = str.charAt(i);
        
        //Closing
        if(ch==')'){
            int count = 0;
            while(s.peek()!='('){
                s.pop();
                count++;
            }
            if(count<1){
                return true;
            }
            else{
                s.pop();
            }
        }
        else{
            //Opening
            s.push(ch);
        }
    }
    return false;
   }
    public static void main(String[] args) {
        String str1 = "([]){}"; // true
        String str2 = "((a+b))";
        String str3 = "(a-b)";
        System.out.println(isValid(str1));
        System.out.println(isDuplicate(str2));
        System.out.println(isDuplicate(str3));
    }
}