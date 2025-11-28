import java.util.*;
public class Logical03 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean result = (a>b) && (a==b);
        // Logical AND operator
        System.out.println("Result of (a > b) && (a == b): " + result);
        boolean result1 = (a<b) || (a==b);
        // Logical OR operator
        System.out.println("Result of (a < b) || (a == b): " + result1);
        boolean result2 = !(a == b);
        // Logical NOT operator
        System.out.println("Result of !(a == b): " + result2);
    }
}