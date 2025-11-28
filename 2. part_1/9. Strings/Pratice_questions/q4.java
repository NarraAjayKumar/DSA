import java.util.*;
public class q4 {
    public static void main(String args[]) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter the String:");
        String str = sc.nextLine();
         System.out.print("Enter the String1:");
        String str1 = sc.nextLine();
        // conevert to all lowercase letters
        str = str.toLowerCase();
        str1 = str1.toLowerCase();
        // checking lengths are equal or not
        if(str.length() == str1.length()) {
            // convert to Array 
            char[] strchar = str.toCharArray();
            char[] str1char = str.toCharArray();
            // sorting
            Arrays.sort(strchar);
            Arrays.sort(str1char);
            boolean result = Arrays.equals(strchar,str1char);
            if(result) {
                System.out.println(str +"and" +str1 +"are anagrams of each other");
            }
            else {
                System.out.println(str +"and" +str1 +"not anagrams of each other");
            }
        }
            else {
                System.out.println(str +"and" +str1 +"length is not equal");
            }
        

        
    }
}