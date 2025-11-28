import java.util.*;
public class Arithmatic01 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The sum is:" + (a+b)); // Addition
        System.out.println("The difference is:" + (a-b)); // Subtraction
        System.out.println("The product is:" + (a*b));// Multiplication
        System.out.println("The division is:" + (a/b));// Division
        System.out.println("The modulus is:" + (a%b));// Modulus
        System.out.println("The increment is:" + (++a)); // Increment
        System.out.println("The decrement is:" + (--b)); // Decrement
        System.out.println("The value of a after increment is:" + a); // Value of a after increment
        System.out.println("The value of b after decrement is:" + b);//  Value of b after decrement
        System.out.println("The value of a after decrement is:" + (a--)); // Value of a after decrement
        System.out.println("The value of b after increment is:" + (b++)); // Value of b after increment
        System.out.println("The value of a after decrement is:" + a); // Value of a after decrement
        System.out.println("The value of b after increment is:" + b); // Value of b after increment
        System.out.println("The value of a after increment is:" + (++a)); // Increment a again
        System.out.println("The value of b after decrement is:" + (--b)); // Decrement b again
        System.out.println("The value of a after increment is:" + a); // Value of a after increment
    }
}