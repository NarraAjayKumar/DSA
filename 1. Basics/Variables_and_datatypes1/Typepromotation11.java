public class Typepromotation11 {
    public static void main(String args[]) {
        byte b = 10; // 1 byte
        short s = 20; // 2 bytes
        int i = 30; // 4 bytes
        long l = 40; // 8 bytes
        float f = 50.5f; // 4 bytes
        double d = 60.5; // 8 bytes

        // Implicit type promotion in expressions
        double result = b + s + i + l + f + d; // All types are promoted to double in the expression

        System.out.println("The result of the expression is: " + result);
    }
}