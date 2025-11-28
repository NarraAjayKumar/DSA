import java.util.*;
public class q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n1 = sc.nextInt();
        System.out.print("Enter a number:");
        int n2 = sc.nextInt();
        System.out.println("Before Swap n1 is:" +n1 +" and n2 is:" +n2);
        n1 = n1^n2;
        n2 = n1^n2;
        n1 = n1^n2;
        System.out.println("After Swap n1 is:" +n1 +" and n2 is:" +n2);
    }

}