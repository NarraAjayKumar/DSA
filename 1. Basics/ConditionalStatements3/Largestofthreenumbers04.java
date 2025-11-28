import java.util.*;
public class Largestofthreenumbers04 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c) {
            System.out.println("The largest numbers is:" + a);
        }
        else if(b>a && b>c){
            System.out.println("The largest number is:" +b);
        }
        else if(c>a && c>b) {
            System.out.println("The largest number is:" +c);
        }
        else {
            System.out.println("All numbers are equal or two numbers are equal");
        }
    }
}