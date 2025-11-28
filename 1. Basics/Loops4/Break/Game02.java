import java.util.*;
public class Game02 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.print("Enter a number:");
            int n = sc.nextInt();
            if(n % 2 == 0) {
                break; // Exit the loop if the number is even
                
            }
            System.out.println(n); // Print the number if it is odd
        } while (true); // Continue until an even number is entered;
    
    }
}