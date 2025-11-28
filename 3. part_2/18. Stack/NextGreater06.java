import java.util.*;
public class NextGreater06 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        System.out.print("Enter the Size of Array:");
        int size = sc.nextInt();
        System.out.println("Enter the Array Elements:");
        int arr[] = new int[size];
        int nextgen[] = new int[arr.length];
        for(int i =0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = arr.length - 1;i>=0; i--) {
            //while loop
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]) {
                s.pop();
            }
            //if-else
            if(s.isEmpty()) {
                nextgen[i] = -1;
            }
            else {
                nextgen[i] = arr[s.peek()];
            }
            //push into stack
            s.push(i);
        }
        for(int i = 0; i<nextgen.length; i++) {
            System.out.print(nextgen[i] +" ");
        }
        System.out.println();
    }
}
//Note:- Time comp is O(n)