public class Usingfun02 {
    public static void update(int marks[]) {
        for(int i= 0; i<marks.length; i++) {
            marks[i] = marks[i] + 1; // increment each mark by 1
        }
    }
    public static void main(String args[]) {
         int marks[] = {97,98,99}; // array of marks
        update(marks); // calling the update function
        for(int i = 0; i<marks.length; i++) {
            System.out.print(marks[i] + " "); // printing updated marks
        }
        
        
    }
}