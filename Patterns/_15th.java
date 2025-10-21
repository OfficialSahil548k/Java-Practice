package Patterns;

import java.util.Scanner;

public class _15th {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();
        // upper half
        for(int i=1; i<=n; i++){
            //starts
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            //spaces
            for(int k=1; k<=2*(n-i); k++){
                System.out.print("  ");
            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // lower half
        for(int i=n; i>=1; i--){
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            //spaces
            for(int k=1; k<=2*(n-i); k++){
                System.out.print("  ");
            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
// *                 * 
// * *             * * 
// * * *         * * * 
// * * * *     * * * * 
// * * * * * * * * * * 
// * * * * * * * * * * 
// * * * *     * * * * 
// * * *         * * * 
// * *             * * 
// *                 * 