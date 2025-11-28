public class IterativeSearch03 {
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
//Method Search
public int Search(int key) {
    int i = 0;
    Node temp = head;
    while(temp!=null) {
        if(temp.data == key) {
            return i;
        }
        temp = temp.next;
        i++;
    }
    // Key not found
    return -1;
}
//Recu Search
public int helper(Node head, int key) {
    //Base case
    if(head == null) {
        return -1;
    }
    if(head.data == key) {
        return 0;
    }
    int idx = helper(head.next,key);
    if(idx == -1) {
        return -1;
    }
    return idx + 1;
}
public int recSearch(int key) {
    return helper(head,key);
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
    IterativeSearch03 ll = new IterativeSearch03();
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
    System.out.println(ll.size);
    System.out.println("Key Found At Index:" +ll.Search(3));
    System.out.println("Key Found in Recursive case At Index:" +ll.recSearch(4));
    

    
}
}