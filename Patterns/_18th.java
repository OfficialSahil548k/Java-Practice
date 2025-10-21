package Patterns;

import java.util.Scanner;

public class _18th {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int k =1; k<=n-i; k++){
                System.out.print("  ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("* ");
            }
            for(int k =1; k<=n-i; k++){
                System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--){
            for(int k =1; k<=n-i; k++){
                System.out.print("  ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("* ");
            }
            for(int k =1; k<=n-i; k++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}

//         *
//       * * *
//     * * * * *
//   * * * * * * *
// * * * * * * * * *
//   * * * * * * *
//     * * * * *
//       * * *
//         *