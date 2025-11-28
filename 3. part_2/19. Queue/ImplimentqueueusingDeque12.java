import java.util.*;
public class ImplimentqueueusingDeque12 {
    public static class Queue {
        Deque<Integer> d = new LinkedList<>();
        //Add
        public void add(int data) {
            d.addLast(data);
        }
        //Remove
        public int remove() {
            return d.removeFirst();
        }
        //peek
        public int peek() {
            return d.getFirst();
        }

    }
    public static void main(String args[]) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("Peek:" +q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}