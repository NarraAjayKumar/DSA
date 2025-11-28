import java.util.*;
public class ReversetheGivennumber03 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int reverse = 0; // Variable to store the reversed number
        for (; n != 0; n = n / 10) {
            int last_digit = n % 10; // Get the last digit
            reverse = reverse * 10 + last_digit; // Build the reversed number
        }
        System.out.println("Reversed number: " + reverse); // Print the reversed number 
    }
}