// StareCase search in matrix
package Arrays_2D;

import java.util.Scanner;

public class _6 {
    public static void starecase_search(int matrix[][], int key){
        int n = matrix.length;
        int m = matrix[0].length;
        int i = n-1, j = 0;
        while(i>=0 && j<m){
            if(matrix[i][j] == key){
                System.out.println("Key found at: (" + i + "," + j + ")");
                return;
            }
            else if(matrix[i][j] > key){
                i--;
            }
            else{
                j++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key to search: ");
        int n = sc.nextInt();
        int matrix[][] = { {1,2,3,4},
                           {5,6,7,8},
                           {9,10,11,12},
                           {13,14,15,16} };
        starecase_search(matrix,n);
    }    
}
