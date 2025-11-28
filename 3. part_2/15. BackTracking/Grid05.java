import java.util.*;
public class Grid05 {
    public static int total(int i, int j, int n, int m) {
        //base case 
        if(i == n - 1 && j == m - 1) { // last cell
            return 1;
        }
        else if (i == n || j == n) {
           return 0; 
        }
        // right
        int w1 =total(i+1,j,n,m);
        int w2 =total(i,j+1,n,m);
        return w1+w2;  
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value:");
        int n = sc.nextInt();
         System.out.print("Enter the m value:");
         int m = sc.nextInt();
         System.out.println(total(0,0,n,m));


    }
}