package Basics;

import java.util.*;

public class input {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.next();
            System.out.print("Hello! " + input);
        }
    }
}
