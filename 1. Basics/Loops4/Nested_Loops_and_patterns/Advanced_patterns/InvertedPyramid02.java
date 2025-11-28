import java.util.*;
public class InvertedPyramid02 {
    public static void inverted(int rows, int col) {
        for(int i =rows; i>0; i--) {
            for(int j = 0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        
        
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num of rows:");
        int rows = sc.nextInt();
        System.out.print("Enter the number of col:");
        int col = sc.nextInt();

     inverted(rows, col);
    }
}