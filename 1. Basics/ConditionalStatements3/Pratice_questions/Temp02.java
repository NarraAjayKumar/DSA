import java.util.*;
public class Temp02 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature:");
        int temp = sc.nextInt();
        if(temp>100) {
            System.out.print("You have fever!");
        }
        else {
            System.out.print("No fever! Your helath is good");
        }


    }
}