import java.util.*;
public class Subset02 {
    public static void subset(String str, String ans, int i) {
        //base case
        if(i == str.length()) {
            if(str.length() == 0) {
                System.out.println("null");
            }
            else {
                System.out.println(ans);
            }
            return;
        }

        //yes
        subset(str, ans+str.charAt(i), i+1);
        //no
        subset(str, ans, i + 1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        String str = sc.nextLine();
        subset(str,"",0);
    }
}