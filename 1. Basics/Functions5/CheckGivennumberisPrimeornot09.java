import java.util.*;
public class CheckGivennumberisPrimeornot09 {
    public static boolean isPrime(int n) {
        if(n== 2) {
            return true; // 2 and 3 are prime numbers
        }
        for(int i = 2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false; // If n is divisible by i, it is not prime
            }
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int n = sc.nextInt();
        isPrime(n); // Call the isPrime method to check if n is prime
        if(isPrime(n)) {
            System.out.println("It is a prime number: " + n); // Print the number if it is prime
        } else {
            System.out.println("It is not a prime number: " + n); // Print the number if it is not prime
        }
    }
}