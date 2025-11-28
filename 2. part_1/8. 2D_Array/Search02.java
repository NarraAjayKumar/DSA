import java.util.*;
public class Search02 {
    public static boolean search(int arr[][], int key, int rows, int col) {
        for(int i = 0; i<rows; i++) {
            for(int j = 0; j<col; j++) {
                if(arr[i][j] == key) {
                    System.out.println("Key Found at cell(" +i +"," +j +")");
                    return true;
                }
    }
}
System.out.println("Key not found");
return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.print("Enter the number of col:");
        int col = sc.nextInt();
        System.out.print("Enter key value:");
        int key = sc.nextInt();
        System.out.println("Enter the elements:");
         int arr[][] = new int[rows][col];
        for(int i =0; i<rows; i++) {
            for(int j = 0; j<col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i = 0; i<rows; i++) {
            for(int j = 0; j<col; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
        boolean result = search(arr,key,rows,col);
        System.out.println(result);

    }
}