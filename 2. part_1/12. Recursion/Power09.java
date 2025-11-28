import java.util.*;
public class Power09 {
    public static int pow(int a, int b) {
        if(b == 0) {
            return 1;
        }
        return a * pow(a,b - 1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a:");
        int a = sc.nextInt();
        System.out.print("Enter the number b:");
        int b = sc.nextInt();
        System.out.println(pow(a,b));
    }
}