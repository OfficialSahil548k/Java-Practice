package functions;
import java.util.*;
public class _3rd {
    static int fact(int n){
        int fact = 1;
        for (int i =1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To find Binomial Coefficient!");
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r : ");
        int r = sc.nextInt();
        int Coefficient = fact(n)/(fact(r)*fact(n-r));
        System.out.println("The Binomial Coefficient C("+n+","+r+") is: " + Coefficient);
    }   
}
