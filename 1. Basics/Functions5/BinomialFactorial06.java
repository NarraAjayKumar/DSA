import java.util.*;
public class BinomialFactorial06 {
    public static int Factorial(int n) {
        int fact = 1;
        for(int i = 1; i<=n; i++) {
            fact = fact * i; // Calculate factorial
            
        }
        return fact; // Return the factorial value
    }
    
    public static int BinomialCoefficient(int n, int r) {
        int factorialN = Factorial(n); // Calculate n!
        int factorialR = Factorial(r); // Calculate r!
        int factorialNR = Factorial(n - r); // Calculate (n-r)!
        int BinomialCoefficient = factorialN / (factorialR * factorialNR); // Calculate binomial coefficient
        return BinomialCoefficient; // Return the binomial coefficient value

    
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();
     BinomialCoefficient(5,10); // Call the method with actual parameters
        System.out.println("Binomial Coefficient C(" + n + ", " + r + ") is: " + BinomialCoefficient(n, r)); // Print the result
    }
}