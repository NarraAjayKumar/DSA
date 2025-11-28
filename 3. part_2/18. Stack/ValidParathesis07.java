import java.util.*;
public class ValidParathesis07 {
    public static boolean validornot(String str) {
        Stack<Character> s = new Stack<>();
        for(int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            //Opening
        if(ch == '(' || ch == '{' || ch == '[') {
        s.push(ch);
    }
    // Closing
    else {
        if(s.isEmpty()) {
            return false;
        }
        if(s.peek() == '(' && ch == ')' 
        || s.peek() == '{' && ch == '}'
        || s.peek() == '[' && ch == ']') {
        s.pop();
        }
        else {
            return false;
        }
    }
}
        if(s.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character:");
        String str = sc.nextLine();
        System.out.print(validornot(str));
        


    }
}
//Time comp - O(n)