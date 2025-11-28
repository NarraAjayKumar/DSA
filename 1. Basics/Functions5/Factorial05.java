import java.util.*;
public class Factorial05 {
    public static int Factorial(int n) {
        int fact = 1; // Initialize factorial variable
        for(int i =1; i<=n; i++) {
            fact = fact * i;
        }
        return fact; // Return the factorial value
    }
    public static void main(String args[]) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");    
        int n = sc.nextInt(); // Read user input
        Factorial(n);
        System.out.println("Factorial of " + n + " is: " + Factorial(n)); // Call the method and print the result   

    }
}