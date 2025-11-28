public class PrintHelloWorldFiveTimes01 {
    public static void main(String args[]) {
       int  count = 0; // Initialize count variable
        while(count<5) {
            System.out.println("Hello,World!"); // Print "Hello,World!" with a newline at the end
            count++; // Increment count variable
        }
        System.out.println("Loop finished!"); // Print a message after the loop ends
    }
}