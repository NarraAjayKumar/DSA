import java.util.*;
public class StockSpan05 {
    //Method
    public static void stockspan(int stock[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for(int i = 1; i<stock.length; i++) {
            int curr = stock[i];
            while(!s.isEmpty() && curr>stock[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()) {
                span[i] = i + 1;
            }
            else {
            int prevhigh = s.peek();
            span[i] = i - prevhigh;
        }
        s.push(i);
    }
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Stock:");
        int size = sc.nextInt();
        System.out.println("Enter the Elements Stock:");
        int stock[] = new int[size];
        int span[] = new int[stock.length];
        for(int i = 0; i<size; i++) {
            stock[i] = sc.nextInt();
        }
        //Function call
        stockspan(stock,span);
        //To print the output
        for(int i = 0; i<span.length; i++) {
            System.out.print(span[i] +" ");
        }
    }
}