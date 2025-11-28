import java.util.*;
public class InvertedChar04 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        System.out.print("Enter a character:");
        char ch = sc.next().charAt(0); // Read a single character input
        System.out.println("Inverted Character Pattern:");
        for(int i = 1;i<=n;i++) {
            for(int j = 1;j<=i; j++) {

                System.out.print(ch); // Print character without newline
                ch++; // Increment character to print next character in the sequence
            }
            System.out.println(); // Move to the next line after printing characters in a row   
        }
    }
}