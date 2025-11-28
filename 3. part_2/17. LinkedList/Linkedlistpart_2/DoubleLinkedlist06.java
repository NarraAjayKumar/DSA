public class DoubleLinkedlist06 {
    public static class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    //add First
    public void AddFirst(int data) {
        Node newnode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }
    // add last
    public void AddLast(int data) {
        Node newnode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }
    //remove first
    public int removeF() {
        if(head == null) {
        System.out.println("Linked list is Empty");
        return Integer.MIN_VALUE;
        }
        if(size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }
    //To remove last
    public int removeL() {
        if(size == 0) {
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1) {
            int val = head.data;
            size = 0;
            head = tail = null;
            return val;
        }
        //size-2 where size - 1 is last idx 
        Node prev = head;
        for(int i = 0; i<size-2;i++) {
            prev = prev.next;
        }
        int val = prev.next.data;// tail data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    //method to print
    public  void print() {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data +"<->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
public static Node head;
public static Node tail;
public static int size;
    public static void main(String args[]) {
        DoubleLinkedlist06 dll = new DoubleLinkedlist06();
        dll.print();
        dll.AddLast(4);
         dll.print();
        dll.AddLast(5);
         dll.print();
        dll.AddFirst(3);
         dll.print();
        dll.AddFirst(2);
         dll.print();
        dll.AddFirst(1);
         dll.print();
         System.out.println(dll.size);
         System.out.println(dll.removeF());
         dll.print();
         System.out.println(dll.size);
         dll.print();
         System.out.println(dll.removeL());
         dll.print();
         System.out.println(dll.size);
    }
}