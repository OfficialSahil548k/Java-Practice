package Arrays_2D;
import java.util.*;
public class _2 {
    static void creatMatrix(int rows, int cols){
        Scanner n = new Scanner(System.in);
        int matrix[][] = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print("Enter the element at index (" + i + "," + j + ") : ");
                matrix[i][j] = n.nextInt();
            }
        }
        // print matrix
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = x.nextInt();
        System.out.print("Enter the number of columns : ");
        int cols = x.nextInt();
        creatMatrix(rows, cols);
    }
}
