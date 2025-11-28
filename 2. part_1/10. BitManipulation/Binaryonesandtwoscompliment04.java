import java.util.*;
public class Binaryonesandtwoscompliment04 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n1 number:");
        int n1 = sc.nextInt();
         System.out.println("Binary One's Compliment is :" + ~n1);
         System.out.println("Binary Two's Compliment is :" + (~n1 + 1));
    }
}