public class Reverse04 {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void AddF(int data) {
        // step 1
        Node newnode = new Node(data);
        if(head == null) {
            head = tail = newnode;
            return;
        }
        //step 2
        newnode.next = head;
        head = newnode;
    }
    public void AddL(int data) {
        //step 1
        Node newnode = new Node(data);
        if(head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }
    public void AddM(int idx, int data) {
        if(idx == 0) {
            AddF(data);
            return;
        }
        //step 1
        Node newnode = new Node(data);
        int i = 0;
        Node temp = head;
        while(i<idx - 1) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;

    }
    public void print() {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public void reverse() {
        Node prev = null;
        Node curr = tail = head; 
        Node next;
        while(curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static Node head;
    public static Node tail;
    public static void main(String args[]) {
        Reverse04 ll = new Reverse04();
        ll.print();
        ll.AddF(2);
        ll.print();
        ll.AddF(1);
        ll.print();
        ll.AddL(4);
        ll.print();
        ll.AddL(5);
        ll.print();
        ll.AddM(2,3);
        ll.print();
        ll.reverse();
        ll.print();

    }
}