package Patterns;

import java.util.Scanner;

public class _14th {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int k=n-i+1; k<=n; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n+1; i<=2*n; i++){
            for(int k=n+1; k<i; k++){
                System.out.print("  ");
            }
            for(int j=i; j<=2*n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
