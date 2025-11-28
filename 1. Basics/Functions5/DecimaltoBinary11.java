import java.util.*;
public class DecimaltoBinary11 {

    public static void DectoBin(int num) {
       int bin_num = 0; // Initialize binary number to 0
        int pow = 0; // Initialize power to 0
        while(num>0) {
            int rem = num % 2; // Get the remainder when num is divided by 2
            bin_num = bin_num + rem * (int)Math.pow(10, pow); // Build the binary number
            pow++; // Increment power for the next digit
            num = num/2; // Divide num by 2 to process the next digit
        }
        System.out.println("Binary value:" +bin_num); // Print the binary value
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number:");
        int num = sc.nextInt(); // Read a decimal number from the user
        DectoBin(num); // Call the DectoBin method to convert decimal to binary
    }
}