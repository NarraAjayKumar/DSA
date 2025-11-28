import java.util.*;
public class ReverseString03 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");
        String str = sc.nextLine();
        Stack<Character> s = new Stack<>();
        for(int i = 0; i<str.length();i++) {
           s.push(str.charAt(i));
        }
        StringBuilder reverse = new StringBuilder();
         while(!s.isEmpty()) {
        reverse.append(s.pop());
        }
        System.out.println("Reversed String is:" +reverse);
    }
}