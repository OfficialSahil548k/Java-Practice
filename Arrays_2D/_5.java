// BruteForce searching an element in 2D array
package Arrays_2D;
import java.util.*;
public class _5 {
    public static void search_key(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Key found at index: (" + i + "," + j + ")");
                    return;
                }
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
        search_key(matrix,n);
    }    
}
