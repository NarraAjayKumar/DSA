import java.util.*;
public class MaxRectangle09 {
    public static void maxarea(int height[]) { // Optimized code Best Time Com is - O(n)
        int maxarea = 0;
        //create area on next smaller Right
      int  nsr[] = new int[height.length];
      //Create next smaller Left
      int nsl[] = new int[height.length];
      //Craete a stack
      Stack<Integer> s = new Stack<>();
        //next smaller Right
        for(int i = height.length - 1; i>=0; i--) { // O(n)
            while(!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsr[i] = height.length;
            }
            else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        //next smaller Left
        s = new Stack<>();
        for(int i = 0; i<height.length; i++) { // O(n)
            while(!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsl[i] = -1;
            }
            else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        //current Area = width = nsr[j] - nsl[i] -1 Area = height * width
        for(int i = 0; i<height.length; i++) { // O(n)
            int h = height[i];
            int width = nsr[i] - nsl[i] -1;
            int currarea = h * width;
            maxarea = Math.max(currarea,maxarea);
        }
        System.out.println("Max Area is = " +maxarea);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size:");
        int size = sc.nextInt();
        System.out.println("Enter the heights:");
        int height[] = new int[size];
        for(int i = 0; i<size; i++) {
            height[i] = sc.nextInt();
        }
        maxarea(height);
    }
}