import java.util.*;
public class CheckPrimeornot03 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt(); // Read an integer input from the user
        boolean isPrime = true; // Assume the number is prime initially
        if(n<=1) {
            isPrime = false; //Numbers less than or equal to 1 are not prime
        }
        else {
            for(int i = 2; i<=Math.sqrt(n); i++) {
                if(n % i == 0) {
                    isPrime = false;
                    System.out.println("It is not a prime number: " + n); // Print the number if it is not prime
                    break; // If n is divisible by i, it is not prime
                }
                System.out.println("It is a prime number: " + n); // Print the number if it is prime
            }
        }
    }
}