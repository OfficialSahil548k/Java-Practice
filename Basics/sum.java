package Basics;

import java.util.*;

public class sum {
    public static void main(String[] args) {
        // int a = 5;
        // float b = 10.5f ;
        // float sum = a+b;

        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter the first number(a) : ");
            float a = s.nextFloat();
            System.out.print("Enter the second number(b) : ");
            float b = s.nextFloat();
            float sum = a + b;
            System.out.print(sum);
        }
    }
}
