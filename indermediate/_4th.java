// Check weather the number is prime or not
package indermediate;
import java.util.*;
public class _4th {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n==2){
            System.out.println("The number is prime");
        }
        else{
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime==true){
            System.out.println("Given number is Prime");
        }else {
            System.out.println("Given number is not Prime");
        }
    }
}
