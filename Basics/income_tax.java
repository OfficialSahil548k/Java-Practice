package Basics;
import java.util.*;

public class income_tax {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Your Income(in Lacs) : ");
            int income = sc.nextInt();

            float tax;
            if(income<5){
                tax = 0;
                System.out.println("The tax on this income is "+ tax);
            }
            else if(income>=5 && income<10){
                tax = (float)(0.2*income);
                System.out.println("The tax on this income is "+ tax);
            }
            else{
                tax =(float)(0.3*income);
                System.out.println("The tax on this income is "+ tax);
            }
        }
    }
}
