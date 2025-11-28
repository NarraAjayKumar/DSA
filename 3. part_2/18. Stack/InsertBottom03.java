import java.util.*;
public class InsertBottom03 {
    public static void Atbottom(Stack<Integer> s , int data) {
        //Base Case
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop(); // Remove Elements
        Atbottom(s,data); // Recurse case
        s.push(top);//Backtracking


    }
    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        Atbottom(s,4);
       while(!s.isEmpty()) {
        System.out.println(s.pop());
        
       }
    }
}