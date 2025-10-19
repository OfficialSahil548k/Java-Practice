package functions;
import java.util.*;
public class _5th {
    static int BinarytoDecimal(int n){
        int p = 0;
        int dec = 0;
        int ld;
        while(n>0){
            ld = n%10;
            dec = dec + ld * (int)Math.pow(2, p);
            p++;
            n = n/10;
        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int n = sc.nextInt();
        int decimal = BinarytoDecimal(n);
        System.out.println("The decimal equivalent is: " + decimal);
    }
}
