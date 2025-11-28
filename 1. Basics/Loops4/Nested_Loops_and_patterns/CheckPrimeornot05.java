import java.util.*;
public class CheckPrimeornot05  {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int n = sc.nextInt(); // Read user input
        boolean isPrime = true; // Assume the number is prime initially
        for(int i =2; i<=n-1;i++) {
            if(n % i == 0) {
                isPrime = false;
                break; // If a divisor is found, set isPrime to false and exit the loop
                
            }
           
        }

    }
    if(isPrime && n>1) {
        System.out.println(n + " is a prime number.");
    } else {
        System.out.println(n + " is not a prime number.");
    }
}