import java.util.Scanner;
public class InvertedandrotatedPyramid03 {
    public static void inverted(int rows, int col) {
        //outer loop
        for(int i = 0; i<rows; i++ ) {
 //spaces
            for(int j = 0; j<rows-i; j++) {
        System.out.print(" ");
            }
            // stars
            for(int j = 0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
            int rows = sc.nextInt();
            System.out.print("Enter number of col:");
            int col = sc.nextInt();
            inverted(rows,col);
        }
    }
