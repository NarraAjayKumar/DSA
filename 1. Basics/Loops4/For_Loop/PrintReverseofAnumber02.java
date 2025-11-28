import java.util.*;
public class PrintReverseofAnumber02 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        while(n!=0) {
            int last_digit = n % 10; // Get the last digit
            System.out.print(last_digit); // Print the last digit
            n = n / 10; // Remove the last digit from the number
        }
    }
}