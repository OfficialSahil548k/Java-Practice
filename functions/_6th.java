package functions;
import java.util.*;
public class _6th {
    static int reverse(int n){
        int rev = 0;
        while(n>0){
            int last_digit = n%10;
            rev = rev*10 + last_digit;
            n = n/10;
        }
        return rev;
    }

    static int findLD(int n){
        if(n%2!=0){
            return 1;
        }else{
            return 0;
        }
    }

    static int DectoBin(int n){
        int Bin = 1;
        int ld = findLD(n);
        while(n>0){
            Bin = Bin * 10 + ld;
            n = n/2;
            ld = findLD(n);
        }
        Bin = reverse(Bin);
        Bin = Bin/10;
        return Bin;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int n = sc.nextInt();
        int binary = DectoBin(n);
        System.out.println("The decimal equivalent is: " + binary);
    }
}