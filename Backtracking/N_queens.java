package Backtracking;

public class N_queens {
     public static int count = 0;

    public static boolean isSafe(char board[][], int row, int col){
        //vertically up
        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        // diagonally up left
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        // diagonally up right
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }

    public static boolean nQueens(char board[][], int row) {
        // base case
        if (row == board.length) {
            // System.out.println("--------------chess board-------------");
            // printChess(board);
            count ++;
            return true;
        }

        // column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if(nQueens(board, row + 1)){
                    return true;
                } // fnx call
                board[row][j] = '-'; // backtrack step
            }
        }
         return false;
    }

    public static void printChess(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '-';
            }
        }
        if(nQueens(board, 0)){
            System.out.println("Solution is possible : ");
            printChess(board);
        }else{
            System.out.println("Solution is not possible");
        }
       // System.out.println("Total ways to solev n queens = " + count);
    }
}
