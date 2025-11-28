public class DllReverse07 {
    public static class Node {
        int data;
        Node prev;
        Node next;
        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    public void AddFirst(int data) {
        Node newnode = new Node(data);
        if(head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }
    //Reverse
    public void reverse() {
        // 3 variables -> Four steps
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr!=null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void print() {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data +"<->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static Node head;
    public static Node tail;
    
    public static void main(String args[]) {
        DllReverse07 dll = new DllReverse07();
        dll.AddFirst(5);
        dll.AddFirst(4);
        dll.AddFirst(3);
        dll.AddFirst(2);
        dll.AddFirst(1);
        dll.print();
        dll.reverse();
        dll.print();
    }
}