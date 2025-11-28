public class Remove02 {
public static class Node { // create node class - blue print
    int data;
    Node next;
    //Constructor
    public Node(int data) {
        //intialize the values
        this.data = data;
        this.next = null;
    }
}
// Methods
public void addF(int data) {
    // Step 1 - Create a new node
    Node newnode = new Node(data);
    size++;
    if(head == null) {
        head = tail = newnode;
        return;
    }
    // Step 2 - new node next = head
    newnode.next = head; // link
    // Step 3 - head = newnode
    head = newnode;
}
// Method to AddLast
public void addL(int data) {
    // Step 1 - Create new node
    Node newnode = new Node(data);
    size++;
    if(head == null) {
        head = tail = newnode;
        return;
    }
    // Step 2 - tail.next = new node
    tail.next = newnode;
    // Step 3 - tail = newnode
    tail = newnode;
}
// Method Add in middle
public void AddMidd(int idx, int data) {
    Node newnode = new Node(data);
    size++;
    Node temp = head;
    int i = 0;
    while(i< idx - 1) {
        temp = temp.next;
        i++;
    }
    // wher i< idx - 1 then we can do this
    newnode.next = temp.next;
    temp.next = newnode;

}
// Method to remove first element
public int removeFirst() {
    if(size == 0) {
        System.out.println("Linked is Empty");
        return Integer.MIN_VALUE;
    }
    else if(size == 1) {
        int val = head.data;
        head = tail = null;
        size = 0;
        return val;
    }
    int val = head.data;
    head = head.next;
    size--;
    return val;
}
// Method to removelast element
public int removeLast() {
    if(size == 0) {
        System.out.println("Linked list is Empty!");
        return Integer.MIN_VALUE;
    }
    else if(size == 1) {
        int val = head.data;
        head = tail = null;
        size = 0;
        return val;
    }
    Node prev = head;
    // size - 2
    for(int i = 0; i<size-2;i++) {
        prev = prev.next;
    }
    int val = prev.next.data;
    prev.next = null;
    tail = prev;
    size--;
    return val;
}
// Method to print
public void print() {
    // Base Case
    if(head == null) {
        System.out.println("Linked list is Empty!");
        return;
    }
    Node temp = head;
    while(temp!=null) {
        System.out.print(temp.data +" ->");
        temp = temp.next;
    }
    System.out.println("null");
}
public static Node head;
public static Node tail;
static int size;
public static void main(String args[]) {
    Remove02 ll = new Remove02();
    ll.print();
    ll.addF(2);
    ll.print();
    ll.addF(1);
    ll.print();
    ll.addL(4);
    ll.print();
    ll.addL(5);
    ll.print();
    ll.AddMidd(2,3);
    ll.print();
    ll.removeFirst();
    ll.print();
    ll.removeLast();
    ll.print();
    System.out.println(ll.size);
}
}