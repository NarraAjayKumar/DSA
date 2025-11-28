import java.util.*;
public class IncomeTaxCalculater03 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        if(income < 500000) {
            System.out.println("Zero percentage tax");
        }
        else if(income>= 500000 && income <1000000) {
            System.out.println("Twenty percentage tax");
        } 
        else if(income> 1000000) {
            System.out.println("Thirty percentage tax");
        } 
        else {
            System.out.println("Invalid income");
        }
    }
}