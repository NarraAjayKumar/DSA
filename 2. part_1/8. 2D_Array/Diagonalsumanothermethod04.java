import java.util.*;
public class Diagonalsumanothermethod04 {

public static int diagonalsum(int arr[][]) {
        int sum =0;
        //pd
        for(int i =0;i<arr.length; i++) {
            sum = sum + arr[i][i];
            //sd
            if(i != arr.length-1-i) {// to avoid overlapping by applying this condition
            sum = sum + arr[i][arr.length-i-1];
        } }
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