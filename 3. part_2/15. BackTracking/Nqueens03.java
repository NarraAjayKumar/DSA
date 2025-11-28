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
    public static void queens(char board[][], int rows) {
        //base case
        if(rows == board.length) {
            printboard(board);
            count++;
            return;
        }
        // columns
        for(int j = 0; j<board.length; j++) {
            if(issafe(board,rows,j)) {
            board[rows][j] = 'Q';
            queens(board,rows + 1); // recursive fun
            board[rows][j] = 'x'; // backtracking
        }
    }
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
    static int count = 0;
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
        queens(board,0);
        System.out.println("No of the ways:" +count);
    }
}