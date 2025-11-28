import java.util.*;
public class Nqueens03 {
    public static boolean issafe(char board[][], int rows, int col) {
        //vertical
        for(int i = rows - 1; i>=0; i--) {
            if(board[i][col] == 'Q') {
            return false;
        }
    }
        //left diagonal
        for(int i = rows - 1, j = col - 1; i>=0 && j>=0; i--,j--) {
            if(board[i][j] == 'Q'){
            return false;
            }
        }
        //right diagonal
        for(int i = rows - 1, j = col + 1; i>=0 && j<board.length; i--,j++ ) {
            if(board[i][j] == 'Q') {
            return false;
            }
        }
        return true;
    }
    public static boolean queens(char board[][], int rows) {
        //base case
        if(rows == board.length) {
            printboard(board);
            return true;
        }
        // columns
        for(int j = 0; j<board.length; j++) {
            if(issafe(board,rows,j)) {
            board[rows][j] = 'Q';
            if(queens(board,rows + 1)) { // recursive fun
            return true;
            }
            board[rows][j] = 'x'; // backtracking
        }
    }
    return false;
    }
    public static void printboard(char board[][]) {
        System.out.println("----------Chess Board---------------");
        for(int i = 0; i<board.length; i++) {
            for(int j = 0; j<board.length; j++) {
                System.out.print(board[i][j] +" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        char board[][] = new char[n][n];
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                board[i][j] = 'x';
            }
        }
        System.out.println(queens(board,0));
    }
}