import java.util.*;
public class Areaofcircle08 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float area = 3.14f * r * r; // Area of circle formula: πr²
        System.out.println("The area of circle with radius" + r + " is: " + area);

    }
}