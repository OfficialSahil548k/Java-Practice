package Arrays_2D;

public class _3 {
    public static void printSpiralMatrix(int matrix[][]){
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;
        while( startRow <= endRow && startCol <= endCol){
            for(int i=startCol; i<=endCol; i++){
                System.out.print(matrix[startRow][i] + " ");
            }
            startRow++;
            for(int i=startRow; i<=endRow; i++){
                System.out.print(matrix[i][endCol] + " ");
            }
            endCol--;
            for(int i=endCol; i>=startCol; i--){
                System.out.print(matrix[endRow][i] + " ");
            }
            endRow--;
            for(int i=endRow; i>=startRow; i--){
                System.out.print(matrix[i][startCol] + " ");
            }
            startCol++;
        }
    }
    public static void main(String[] args) {
        int matrix[][] = { {1,2,3,10},
                           {4,5,6,11},
                           {7,8,9,12},
                           {13,14,15,16} };
        printSpiralMatrix(matrix);
    }
}
