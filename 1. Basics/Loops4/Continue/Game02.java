import java.util.*;
public class Game02 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.print("Enter a number:");
            int num = sc.nextInt(); // Read an integer input from the user
            if(num % 10 == 0) {
                continue; // If the number is a multiple of 10, skip the rest of the loop and ask for input again

            }
            System.out.println("You entered: " + num); // Print the number if it is not a multiple of 10
        } while (true);
    }
}