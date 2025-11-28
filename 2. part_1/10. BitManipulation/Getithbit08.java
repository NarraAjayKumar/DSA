import java.util.*;
public class Getithbit08 {
    public static int getithbit(int n, int i) {
        int bitmask = 1<<i;
        if((n & bitmask) == 0) {
            return 0;
        }
        return 1;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n1 number:");
        int n = sc.nextInt();
        System.out.print("Enter the ith number:");
        int i = sc.nextInt();
        System.out.println(getithbit(n,i));
        
    }
}