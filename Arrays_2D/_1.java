package Arrays_2D;

public class _1 {
    public static void main(String[] args) {
        int matrix[][] = { {1,2,3},
                           {4,5,6},
                           {7,8,9} } ;
        int n = matrix.length;
        int m = matrix[0].length;
        // print array 
        for(int i=0; i<=n-1; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}