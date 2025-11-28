import java.util.*;
public class Hollowpattern01 {
    public static void pattern(int totrows, int totcol) {
        //outer loop
        for(int i = 1; i<=totrows; i++) {
            //inner loop
            for(int j = 1; j<=totcol; j++) {
                //cell - (i,j)
                if(i==1 || i==totrows ||j==1|| j==totcol) {
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int totrows = sc.nextInt();
        System.out.print("Enter number of col:");
        int totcol = sc.nextInt();
        pattern(totrows,totcol);
       
    }
    

}