import java.util.*;
public class BinarytoDecimal10 {
    public static void BinarytoDecimal(int binary) {
        int pow = 0; // Initialize power to 0
        int decimal = 0;
        while(binary>0) {
            int last_digit = binary % 10; // Get the last digit of the binary number
            decimal = decimal + (last_digit * (int)Math.pow(2, pow)); // Convert binary to decimal
            pow++; // Increment power for the next digit
            binary = binary /10; // Remove the last digit from the binary number
            
        }
        System.out.println("Decimal value:" +decimal); // Print the decimal value
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number:");
        int binary = sc.nextInt(); // Read a binary number from the user
        BinarytoDecimal(binary); // Call the BinarytoDecimal method to convert binary to decimal
    }
}