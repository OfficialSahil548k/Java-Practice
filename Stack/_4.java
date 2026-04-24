package Stack;

import java.util.Stack;

public class _4 {
    public static String revString(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<=str.length()-1; i++){
            s.push(str.charAt(i));
        }
        StringBuilder newStr = new StringBuilder();
        while(!s.isEmpty()){
            newStr.append(s.pop());
        }
        return newStr.toString();
    }
    public static void main(String[] args) {
        String str = "Sahil";
        String newStr = revString(str);
        System.out.println(newStr);
    }
}
