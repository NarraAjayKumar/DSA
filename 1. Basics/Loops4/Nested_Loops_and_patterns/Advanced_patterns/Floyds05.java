import java.util.*;
public class Floyds05 {
    public static void traingle(int n) {
        int count = 1;
        for(int i =1; i<=n; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print(" " +count);
                count++;
               
            }
            System.out.println();
                }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        traingle(n);

    }

}