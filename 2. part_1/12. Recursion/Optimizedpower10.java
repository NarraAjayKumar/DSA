import java.util.*;
public class Optimizedpower10 {
    public static int optimized(int a, int b) {
        if(b == 0) {
            return 1;
        }
            int half = optimized(a, b/2) * optimized(a, b/2);
            // if odd
            if(b%2!=0) {
                half = a * half;
            }

        return half;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a:");
        int a = sc.nextInt();
         System.out.print("Enter the number b:");
         int b = sc.nextInt();
         System.out.println(optimized(a,b));
    }
}