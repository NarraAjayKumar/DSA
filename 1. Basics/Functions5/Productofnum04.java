import java.util.*;
public class Productofnum04 {
    public static void Product(int a, int b) { 
        int c =  a*b;
        System.out.println("Product of " + a + " and " + b + " is: " + c);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        Product(a, b); // Call the method with actual parameters

    }
}