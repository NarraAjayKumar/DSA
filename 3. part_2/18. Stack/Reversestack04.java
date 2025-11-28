import java.util.*;
public class Reversestack04 {
    public static void Atbottom(Stack<Integer> s, int data) {
        //Base case 
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        Atbottom(s,data);
        s.push(top);
    }
    public static void reversestack(Stack<Integer> s) {
        //Base case
        if(s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reversestack(s);
        Atbottom(s,top);
    }
    public static void print(Stack<Integer> s) {
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }

    }
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Size of number:");
    int n = sc.nextInt();
    System.out.println("Enter the number of Elements:");
    Stack<Integer> s = new Stack<>();
    for(int i =0;i<n; i++) {
        int num = sc.nextInt();
        s.push(num);
    }
    reversestack(s);
    print(s);
}
}