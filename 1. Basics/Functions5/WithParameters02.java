import java.util.*;
public class WithParameters02 {
    public static void Calculater(int a, int b, char operation) { // define method with formal parameters

        if(operation == '+') {
            System.out.println("Result:" +(a+b));
        }
        else if(operation == '-') {
            System.out.println("Result:" +(a-b));
        }
        else if(operation == '*') {
            System.out.println("Result:" +(a*b));
        }
        else if(operation == '/') {
            if(b!=0) {
                System.out.println("Result:" +(a/b));
            }
            else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        }

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter operation (+, -, *, /): ");
        char operation = sc.next().charAt(0);
        Calculater(a,b,operation); // Calling with actual parameters

    }
}