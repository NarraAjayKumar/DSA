import java.util.*;
public class Checkpostiveornegative01 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        if(num>=0) {
            System.out.println("Given number is postive!");
        }
            else if(num<=-1) {
                System.out.println("Given number is negative!");
            }

        }
    }
