import java.util.*;
public class Divisableby2ornot01 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number % 2==0) {
            System.out.println("Divisible by 2");
        } else {
            System.out.println("Not Divisible by 2");
        }
    }
}