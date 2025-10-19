package functions;
import java.util.*;

public class _4th {
    static boolean isPrime(int n){
        for (int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    static void printPrime(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find all prime numbers up to that number: ");
        int n = sc.nextInt();
        printPrime(n);
    }
}
