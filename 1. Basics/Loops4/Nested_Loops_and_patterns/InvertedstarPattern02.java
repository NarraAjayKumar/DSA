import java.util.*;
public class InvertedstarPattern02 {
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number:");
    int n = sc.nextInt();
    for(int i = 1; i<=n;i++) { // Outer loop for rows
        for(int j = n;j>=i;j--) { // Inner loop for columns
            System.out.print("*"); // Print star without newline    
        }
        System.out.println(); // Move to the next line after printing stars in a row
        }
}
}