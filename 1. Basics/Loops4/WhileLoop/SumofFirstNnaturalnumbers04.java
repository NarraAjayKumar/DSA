import java.util.*;
public class SumofFirstNnaturalnumbers04 {
    public static void main(String args[]) {
        int sum = 0; // Initialize sum variable
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number N:");
        int N = sc.nextInt(); // Read user input for N
       int  i = 1;
        while(i<=N) {
           sum = sum + i;
           i++; // Increment i variable
        }
        System.out.println("Sum of first " + N + " natural numbers is: " + sum); // Print the sum
    }
}