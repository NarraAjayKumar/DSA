public class Callbyvalue03 {
    public static void Swap(int a, int b) {
       int  temp = a;
        a = b;
        b = temp;
        System.out.println("Inside Swap method: a = " + a + ", b = " + b);
    }
    public static void main(String args[]) {
        int a = 5;
        int b = 10;
        System.out.println("Before Swap: a = " + a + ", b = " + b); // This is known as calling by value (copying the values of a and b to the method parameters)
        Swap(a, b); // Call the method with actual parameters

    }
}