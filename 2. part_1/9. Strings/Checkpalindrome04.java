import java.util.*;
public class Checkpalindrome04 {
    public static boolean print(String str) {
        int n = str.length();
        // loop
    for(int i =0; i<str.length()/2; i++) {
        if(str.charAt(i) == str.charAt(n-1-i)) {
            return true;
        }
    }
    return false;
        }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        String str = sc.nextLine();
        boolean result = print(str);
        System.out.println(result);
    }
}