import java.util.ArrayList;
public class ArrayList01 {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isempty() {
            return list.size() == 0;
        }
        //push
        static void push(int data){
            list.add(data);
        }
        //pop
        static int pop() {
            if(isempty()) {
                return -1; // That means Stack is Empty
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }
        //peek
        static int peek() {
            if(isempty()) {
                return -1; // that means Stack is Empty
            }
            return list.get(list.size() - 1);
        }
    } 
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        
      while(!s.isempty()) {
    System.out.println(s.peek());
     s.pop();
    }
    }
}