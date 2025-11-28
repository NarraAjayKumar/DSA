import java.util.*;
public class q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Character:");
        String str = sc.nextLine();
        int count = 1;
        for(int i = 1; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println(count);

    }
}
// q2 - false true
//q3 - replace l with "" - that means remove l