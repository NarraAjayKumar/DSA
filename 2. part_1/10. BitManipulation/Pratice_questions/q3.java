import java.util.*;
public class q3 {
public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int result = -~n;
        System.out.println("n + 1 using Bitwise:" +result);
}
}