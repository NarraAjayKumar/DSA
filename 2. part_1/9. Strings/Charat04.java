import java.util.*;
public class Charat04 {
    public static void print(String str) {
        for(int i = 0; i<str.length(); i++) {
            System.out.print(str.charAt(i) +" ");
        }
        
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String first_name = sc.nextLine();
        String last_name = sc.nextLine();
        String full_name =first_name + " " + last_name;
        System.out.println(full_name +" This Concatination");
        print(full_name);
    }
}