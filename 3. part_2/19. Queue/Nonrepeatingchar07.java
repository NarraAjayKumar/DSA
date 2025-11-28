import java.util.*;
public class Nonrepeatingchar07 {
    public static void printnonrepeating(String str) {
        Queue<Character> q = new LinkedList<>();
        //convert All uppercase letters to lowercaseletters
        str = str.toLowerCase();
        int freq[] = new int[26];
        for(int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;
            while(!q.isEmpty() && freq[q.peek() - 'a']>1) {
                q.remove();
            }
            if(q.isEmpty()) {
                System.out.print(-1 +" ");
            }
            else {
                System.out.print(q.peek() +" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");
        String str = sc.nextLine();
        printnonrepeating(str);
    }
}