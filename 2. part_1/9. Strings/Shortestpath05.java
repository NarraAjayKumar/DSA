import java.util.*;
public class Shortestpath05 {
    public static float print(String str) {
        int x = 0 , y = 0;

        //loop
        for(int i = 0; i<str.length(); i++) {
            char dir = str.charAt(i);
            // North
            if(dir == 'N') {
                y++;
            }
            // South
            else if(dir == 'S') {
                y--;
            }
            // West
            else if(dir == 'W') {
                x--;
            }
            // East
            else {
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string");
        String str = sc.nextLine();
        System.out.println(print(str));

    }
}