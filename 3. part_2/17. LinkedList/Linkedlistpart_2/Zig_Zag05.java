public class Zig_Zag05 {
    public static class Node { // where in this code automatically call extends class(object) is nothing object -> this is blue print
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // Add elements at last by using Method
    public void AddLast(int data) {
        Node newnode = new Node(data);
        if(head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }
    // Zig_Zag method
    public void Zig_Zag() {
        // To find Mid
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        //To Reverse
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // To alterate Merge->Zig_Zag
        Node left = head;
        Node right = prev;
        // Temp variables
         Node nextL;
         Node nextR;
        while(left!=null && right!=null) {
        nextL = left.next;// saved
        left.next = right;
        nextR = right.next;//saved
        right.next = nextL;
        //update
        right = nextR;
        left = nextL;
        }
        
    }
    // Print the elements using Method
    public void print() {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static Node head;
    public static Node tail;
    public static void main(String args[]) {
        Zig_Zag05 ll = new Zig_Zag05();
        ll.print();
        ll.AddLast(1);
        ll.print();
        ll.AddLast(2);
        ll.print();
        ll.AddLast(3);
        ll.print();
        ll.AddLast(4);
        ll.print();
        ll.AddLast(5);
        ll.print();
        ll.Zig_Zag();
        ll.print();
    }
}