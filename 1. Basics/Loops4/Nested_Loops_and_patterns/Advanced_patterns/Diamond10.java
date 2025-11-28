import java.util.*;
public class Diamond10 {
    public static void diamond(int n) {
        // 1 st half
        for(int i =1; i<=n; i++)  { // outer loop 
            //spaces 
            for(int j = 1; j<=(n-i); j++) { // inner loop
                System.out.print(" ");
            }
            //Stars
            for(int j = 1; (j<=2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
    }
    // Second half
    for(int i = n; i>=1; i--) {
         for(int j = 1; j<=(n-i); j++) { // inner loop
                System.out.print(" ");
            }
            //Stars
            for(int j = 1; (j<=2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();

    }
    
}
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        diamond(n);
    }
}