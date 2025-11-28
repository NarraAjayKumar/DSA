public class CheckPalindrome05 {
    public static class Node { // Blue Print
        int data; // variable decleration
        Node next;
        public Node(int data) { // Constructor
            this.data = data;
            this.next = null;
        }
    }
    public boolean Palindrome() {
     // Step1 - Slow fast find mid
    Node slow = head;
    Node fast = head.next;
    while(fast!=null && fast.next!=null) {
        slow = slow.next;
        fast = fast.next.next;
    }
     Node mid = slow;
     // two half - Reverse
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
     Node left = prev;
     Node right = head;
     while(left!=null) {
        if(left.data!=right.data) {
            return false;
        }
        // Update
        left = left.next;
        right = right.next;
     }
     return true;

    }
    
    // Method To Add First of the Linkedlist
    public void AddFirst(int data) {
        Node newnode = new Node(data);
        if(head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    // Method
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
        CheckPalindrome05 ll = new CheckPalindrome05();
        ll.print();
        ll.AddFirst(1);
          ll.print();
        ll.AddFirst(2);
          ll.print();
        ll.AddFirst(3);
          ll.print();
        ll.AddFirst(1);
          ll.print();
        ll.print();
       System.out.println(ll.Palindrome());
    }
}