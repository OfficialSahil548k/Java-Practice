package Arrays_2D;
import java.util.*;
public class _4 {
    public static void calc_diagonal_sum(int matrix[][]){
        int PDsum = 0;
        int SDsum = 0;
        for(int i=0; i<matrix[0].length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(i == j){
                    PDsum += matrix[i][j];
                }
                if(j == matrix.length - i - 1){
                    SDsum += matrix[i][j];
                }
            }
        }
        int totalSum = PDsum + SDsum;
        System.out.println("The sum of both diagonals is: " + totalSum);
    }

    public static void main(String[] args) {
        int matrix[][] = { {1,2,3,4},
                           {5,6,7,8},
                           {9,10,11,12},
                           {13,14,15,16} };
        calc_diagonal_sum(matrix);
    }
}
