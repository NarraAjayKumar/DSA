import java.util.*;
public class Largestoftwonumbers02 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b) {
            System.out.println("The largestnumber is " + a);
        }
        else if(b>a) {
            System.out.println("The largest number is:" +b);
        }
        else {
            System.out.println("Both number are equal");
        }
    }
}