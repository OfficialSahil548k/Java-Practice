package Patterns;
import java.util.*;

public class _7th {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n1 = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int n2 = sc.nextInt();
        for(int i=1; i<=n1; i++){
            for(int j=1; j<=n2; j++){
                if(i==1 || j==1 || i==n1 || j==n2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
