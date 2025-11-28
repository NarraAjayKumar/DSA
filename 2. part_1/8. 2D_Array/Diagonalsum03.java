import java.util.*;
public class Diagonalsum03 {
    public static int diagonalsum(int arr[][]) {
        int sum =0;
        for(int i = 0; i<arr.length; i++) {
            for(int j =0; j<arr[0].length; j++) {
                //primary
                if(i==j) {
                    sum = sum + arr[i][j];
                }
                //secondary
                else if(i+j == arr.length-1) {
                    sum = sum + arr[i][j];

                }
            }
        }
        return sum;
    }
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.print("Enter the number of col:");
        int col = sc.nextInt();
        System.out.println("Enter the elements:");
        int arr[][] = new int[rows][col];
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i = 0; i<rows; i++) {
            for(int j =0; j<col; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println(diagonalsum(arr));
    }
}