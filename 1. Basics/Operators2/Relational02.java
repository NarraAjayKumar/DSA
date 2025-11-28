import java.util.*;
public class Relational02 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Is a equal to b? " + (a == b)); // Equal to
        System.out.println("Is a not equal to b? " + (a != b)); // Not equal to
        System.out.println("Is a greater than b? " + (a > b)); // Greater than
        System.out.println("Is a less than b? " + (a < b)); // Less than
        System.out.println("Is a greater than or equal to b? " + (a >= b)); // Greater than or equal to
        System.out.println("Is a less than or equal to b? " + (a <= b)); // Less than or equal to
    }
}