package Patterns;

import java.util.Scanner;

public class _10th {
    public static void main(String[] args) {
        int count = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j =1; j<=i; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
