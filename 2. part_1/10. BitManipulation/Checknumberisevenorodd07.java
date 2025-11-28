import java.util.*;
public class Checknumberisevenorodd07 {
    public static void evenorodd(int n) {
        int bitmask = 1;
        if((n & bitmask) == 0) {
            // even
            System.out.println("It is even");
        }
        else {
            System.out.println("It is odd");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n1 number:");
        int n = sc.nextInt();
        evenorodd(n);
        
    }
}