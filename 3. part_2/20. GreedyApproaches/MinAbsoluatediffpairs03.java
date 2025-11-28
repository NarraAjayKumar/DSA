import java.util.*;
public class MinAbsoluatediffpairs03 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of Array both A and B are Same:");
        int size = sc.nextInt();
        System.out.println("Enter the Array of A Elements:");
        int A[] = new int[size];
        for(int i = 0; i<size; i++) {
            A[i] = sc.nextInt();
        }
        int B[] = new int[size];
        System.out.println("Enter the Array of A Elements:");
        for(int i = 0; i<size; i++) {
            B[i] = sc.nextInt();
        }
       Arrays.sort(A);
       Arrays.sort(B);
         int mindiff = 0;
       for(int i = 0; i<A.length; i++) {
        mindiff = mindiff + Math.abs(A[i] - B[i]);
       }
       System.out.println("The difference between the Mindiff:" +mindiff);
    }
}