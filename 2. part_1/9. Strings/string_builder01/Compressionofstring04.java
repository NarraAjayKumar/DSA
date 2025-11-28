import java.util.*;
public class Compressionofstring04 {
    public static String compression(String str) {
        String newstr = "";
        for(int i = 0; i<str.length(); i++) {
            Integer count = 1;
            while(  i<str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;

            }
            newstr = newstr + str.charAt(i);
            if(count>1) {
                newstr = newstr + count.toString();
            }
        }
        return newstr;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String str = sc.nextLine();
        System.out.println(compression(str));
    }
}