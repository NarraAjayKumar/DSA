import java.util.*;
public class PrintOnetoN03 {
    public static void main(String args[]) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number N:");
        int N = sc.nextInt(); // Read user input for N
        while(count<N) {
            System.out.print(count + 1 + " "); // Print the current count + 1
            count++; // Increment count variable

        }
    }
}