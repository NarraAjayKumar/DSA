import java.util.*;
public class Deque10 {
    public static void main(String args[]) {
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(1); //1
        d.addFirst(2);//2 1
        System.out.println(d); //[2,1]
        d.addLast(3); // 2 1 3
        d.addLast(4);// 2 1 3 4
        System.out.println(d); // [2,1,3,4]
        d.removeFirst(); // 1 3 4
        System.out.println(d); // [1,3, 4]
        d.removeLast(); // 1 3
        System.out.println(d); //[1,3]
        System.out.println("element at First:" + d.getFirst()); // 1
        System.out.println("element at Last:" + d.getLast()); // 3
    }
}