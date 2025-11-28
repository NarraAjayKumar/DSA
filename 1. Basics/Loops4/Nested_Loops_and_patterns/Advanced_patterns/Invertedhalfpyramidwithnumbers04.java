import java.util.*;
public class Invertedhalfpyramidwithnumbers04 {
    public static void inverted(int n) {
        //outer lopp
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=n-i; j++) {
                System.out.print(" ");   
            }
            for(int j =1; j<=i; j++) {
                System.out.print(j);
            }
       System.out.println();

        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        inverted(n);
    }
}