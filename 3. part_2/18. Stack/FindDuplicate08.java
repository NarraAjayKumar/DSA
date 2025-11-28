import java.util.*;
public class FindDuplicate08 {
    public static boolean tofind(String str) {
        Stack<Character> s = new Stack<>();
        for(int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            //Closing
            if(ch == ')') {
                int count = 0;
                while(s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if(count<1) {
                    return true;
                }
                else {
                    s.pop();
                }
            }
                // opening 
             else {
                s.push(ch);
                }
            
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");
        String str = sc.nextLine();
          System.out.println(tofind(str));
    }
}