import java.util.*;
public class Assignment04 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+=b; // Assignment operator
        int d = a-=b;
        int e = a*=b;
        int f = a/=b;
        int g = a%=b;
        System.out.println("Result of a += b: " + c);
        System.out.println("Result of a -= b: " + d);   
        System.out.println("Result of a *= b: " + e);
        System.out.println("Result of a /= b: " + f);
        System.out.println("Result of a %= b: " + g);
        // The above code demonstrates the use of assignment operators in Java. 
    }
}