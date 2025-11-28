import java.util.*;
public class Advanced_problem03 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the pencil cost:");
        float pencil = sc.nextFloat();
        System.out.print("Enter the pen cost:");
        float pen = sc.nextFloat();
        System.out.print("Enter the eraser cost:");
        float eraser = sc.nextFloat();
        float total_cost = pencil + pen + eraser;
        float total_cost_with_gst = total_cost * 0.18f;
        System.out.println(total_cost_with_gst); 
    }
}

// q3 answer is double type because of type conversion
// q4 answer is no why because identifiers/VARIABLES start with underscore or any alphabet so not get error  