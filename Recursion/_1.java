package Recursion;
import java.util.*;
public class _1 {
    static void print_Num(int n){
        if(n > 0){
            System.out.print(n + " ");
        n = n-1;
        print_Num(n);
        }
        else {
            System.out.println(".....positive numbers ends.");
            return;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = s.nextInt();
        print_Num(n);
    }
}

