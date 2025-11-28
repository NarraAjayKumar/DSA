import java.util.*;
public class Creationandupdate01 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[100];
        marks[0] = sc.nextInt(); // physics marks
        marks[1] = sc.nextInt(); // chemistry marks
        marks[2] = sc.nextInt(); // math marks
        System.out.println("Marks of physics:" + marks[0]);
        System.out.println("Marks of chemistry:" + marks[1]);
        System.out.println("Marks of math:" + marks[2]);
        marks[0] = 98; // updating physics marks
        int percentage = (marks[0] +marks[1] + marks[2]) / 3; // calculating percentage
        System.out.println("Percentage of marks:" + percentage + "%");
        System.out.println(marks.length); // prints the length of the array
    }   
}