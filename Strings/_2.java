package Strings;
import java.util.*;
public class _2 {
    public static void check_palindrome(String str){
        int i = 0;
        while(i < str.length() / 2){
            if(str.charAt(i) != str.charAt(str.length() -1-i)){
                System.out.println("Not a palindrome");
                return;
            } else {
                i++;
            }
        }
        System.out.println("Is a palindrome");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to check for palindrome: ");
        String str = sc.nextLine();
        check_palindrome(str);
        sc.close();
    }
}
