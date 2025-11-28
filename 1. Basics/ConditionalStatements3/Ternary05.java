import java.util.*;
public class Ternary05 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String type = (num % 3 ==0)? "Even": "Odd";
        System.out.println(type);
    }
}