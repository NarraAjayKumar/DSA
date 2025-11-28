import java.util.*;
public class Invertednumbers03 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++) {
            for(int j = 1;j<=i;j++) {
                System.out.print(j); // Print numbers without newline
            }
            System.out.println(); // Move to the next line after printing numbers in a row
        }
    }
}