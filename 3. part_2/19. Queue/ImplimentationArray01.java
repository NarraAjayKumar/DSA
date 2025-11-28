
public class ImplimentationArray01 {
  public static class Queue {
    static int arr[]; // queue array to hold Elements
    static int size;// capacity
    static int rear; // last index
    Queue(int n) { // Constructor
        arr = new int[n];//To Create Queue Empty
        size = n; // where size is assign to n
        rear = -1; // no elements yet
    }
    // Where Queue isEmpty then rear == -1
    public static boolean isEmpty() {
          return rear == -1;  
        }
        // Add Elements in  Queue insert at rear
        public static void add(int data) { // we want insert element so we take data as parameter
            if(rear == size - 1) { // where idex st from 0 to n - 1
                System.out.println("Queue is Full!");
                return;
            }
            rear = rear + 1; // incerement by 1
            arr[rear] = data; // data that data to arr
        }
        // Remove
        public static int remove() {
            if(isEmpty()) { // where Queue isempty no elements are there so it return -1
                System.out.println("Empty Queue!");
                return -1;
            }
            int front = arr[0]; // start idex
            for(int i = 0; i<rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return front;
        }
        // Peek
        public static int peek() {
            if(isEmpty()) { // where Queue isempty no elements are there so it return -1
                System.out.println("Empty Queue!");
                return -1;
        }
        return arr[0];
    }
  }
    public static void main(String args[]) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}