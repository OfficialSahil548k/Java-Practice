// convert first letter of each word to uppercase
package Strings;
import java.util.*;
public class _4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char ch = Character.toUpperCase(str.charAt(0));
        StringBuilder sb = new StringBuilder();
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                char c = Character.toUpperCase(str.charAt(i));
                sb.append(c);
            }else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println("Converted string: " + sb.toString());
        sc.close();
    }
}
