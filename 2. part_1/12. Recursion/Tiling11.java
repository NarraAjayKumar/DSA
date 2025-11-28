import java.util.*;
public class Tiling11 {
    public static int tiling(int n) {
        
        if(n == 0 || n == 1) { // Base Case
            return 1;
        }
        // vertical case 
        int vertical = 2 + tiling(n - 1);
        // horizontal Case
        int hor = 2 + tiling(n - 2);
        // total
        int total = vertical + hor;
        return total;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        System.out.println(tiling(n));
    }
}
// note :- this one have doubt in problem statement