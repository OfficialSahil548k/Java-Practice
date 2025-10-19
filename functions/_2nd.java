package functions;
import java.util.*;
public class _2nd {
    static int fact(int n){
        int fact = 1;
        for (int i =1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find factorial: ");
        int n = sc.nextInt();
        int factorial = fact(n);
        System.out.println("The factorial of " + n + " is: " + factorial);
    }
}
