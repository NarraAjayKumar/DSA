public class OverloadingusingParameters07 {
    public static int sum(int a, int b) {
        return a+b; // Method to sum two integers
    }
    public static int sum(int a, int b, int c) {
        return a + b + c; // Method to sum three integers
    }
    public static void main(String args[]) {
        System.out.println(sum(5,5)); // Calling the first sum method with two parameters
        System.out.println(sum(5,5,5)); // Calling the second sum method with three parameters

    }
}