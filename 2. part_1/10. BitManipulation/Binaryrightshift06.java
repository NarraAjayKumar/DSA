import java.util.*;
public class Binaryrightshift06 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n1 number:");
        int n1 = sc.nextInt();
        System.out.print("Enter the n2 number:");
         int n2 = sc.nextInt();
         System.out.println("Binary XOR is :" +(n1>>n2));
    }
}