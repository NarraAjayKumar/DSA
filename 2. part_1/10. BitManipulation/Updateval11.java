import java.util.*;
public class Updateval11 {
    public static int clear(int n, int i) {
       int bitmask = ~(1<<i);
        return (n & bitmask);
    }
    public static int update(int n, int i, int update) {
        n =  clear(n,i);
        int bitmask = update<<i;
        return (n | bitmask);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n1 number:");
        int n = sc.nextInt();
        System.out.print("Enter the ith number:");
        int i = sc.nextInt();
        System.out.print("Enter the update number:");
        int update = sc.nextInt();
        System.out.println(update(n,i,update));
        
    }
}