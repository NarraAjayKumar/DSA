public class Mergesort04 {
    public static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
    //Calculate Mid
    private Node getmid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;//+1
            fast = fast.next.next; //+2
        } 
        return slow; // this is mid
    }
    // Merge
    private Node merge(Node head1, Node head2) {
        Node mergedll = new Node(-1);
        Node temp = mergedll;
        while(head1!=null && head2!=null) {
            if(head1.data<=head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
                else {
                    temp.next = head2;
                    head2 = head2.next;
                    temp = temp.next;
                } 
        }
        while(head1!=null) {
             temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
        }
        while(head2!=null) {
            temp.next = head2;
                    head2 = head2.next;
                    temp = temp.next;
        }
        return mergedll.next;
    }
    public Node mergesort(Node head) {
        // base case
        if(head == null || head.next == null) {
            return head;
        }
        //find mid
        Node mid = getmid(head);
        //left and right mergesort
        Node righthead = mid.next;
        mid.next = null;
        Node newleft = mergesort(head); // left half
        Node newright = mergesort(righthead); // right half
        //merge
        return merge(newleft,newright);
    }
    //Method
    public  void addFirst(int data) {
        Node newnode = new Node(data);
        if(head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode; 
    }
    //method
    public  void print() {
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
        Mergesort04 ll = new Mergesort04();
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addFirst(4);
        ll.print();
        ll.addFirst(5);
        System.out.println("Before Sorting:");
        ll.print();
        ll.head = ll.mergesort(ll.head);
        System.out.println("After Sorting:");
        ll.print();
        

    }
}