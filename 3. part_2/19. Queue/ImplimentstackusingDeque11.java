import java.util.*;
public class ImplimentstackusingDeque11 {
    public static class Stack {
        Deque<Integer> d = new LinkedList<>();
        //push
        public  void push(int data) {
            d.addLast(data);
        }
        //pop
        public int pop() {
            return d.removeLast();
        }
        //peek
        public int peek() {
            return d.getLast();
        }
    }
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Peek:" + s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}