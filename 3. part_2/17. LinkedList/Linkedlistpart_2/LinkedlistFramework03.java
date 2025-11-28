import java.util.LinkedList;
public class LinkedlistFramework03 {
    public static void main(String args[]) {
       // Create a LinkedList
        LinkedList<Integer> ll = new LinkedList<>();
        //Add 
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        //Print
        System.out.println(ll);
        //0->1->2
        //remove
    ll.removeFirst();
    ll.removeLast();
    System.out.println(ll);
    // 1
    }
    
}