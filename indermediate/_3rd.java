package indermediate;
import java.util.*;
public class _3rd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        int rev = 0;
        while(n>0){
            int last_digit = n%10;
            rev = rev*10 + last_digit;
            n = n/10;
        }
        System.out.println("The Reverse of the Number is : " + rev);
    }
}
