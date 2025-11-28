public class Overloadingwithdatatypes08 {
    public static int sum(int a, int b) {
        return a + b; // Method to sum two integers
    }
    public static float sum(float a, float b) {
        return a + b; // Method to sum two floats
    }
    public static void main(String args[]) {
        System.out.println(sum(5,5)); // Calling the first sum method with two integers
        System.out.println(sum(5.5f, 5.5f)); // Calling the second sum method with two floats

    }

} 