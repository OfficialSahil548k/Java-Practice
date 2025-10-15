package indermediate;

import java.util.*;

public class _2nd{
    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in);
    int sum = 0;
    System.out.print("Enter the number upto which you want the sum : ");
    int n = sc.nextInt();
    int count = 1;
    while(count<=n)
    {
        sum = sum + count;
        count++;
    }
    System.out.println("Total sum of values : " + sum);
    }
    catch(Exception e){
        System.out.println(e);
    }
    }
}
