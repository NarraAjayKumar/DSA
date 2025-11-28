import java.util.*;
public class Multiplication03 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int table;
        for(int i =1; i<=10; i++) {
            table = num * i;
            System.out.println( + num +" x "  +i +" = " +table );
        }
    }
}