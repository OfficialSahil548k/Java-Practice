package functions;

import java.util.Scanner;

public class _6th_alternate {

    static int DectoBin(int n){
        int p = 0;
        int Bin = 0;
        int ld = n%2;
        while(n>0){
            Bin = Bin + ld * (int)Math.pow(10, p);
            p++;
            n = n/2;
            ld = n%2;
        }
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
