public class Break01 {
    public static void main(String args[]) {
        for(int i = 0; i<=5;i++) {
            if(i==4) {
                break; // Exit the loop when i equals 4
            }
            System.out.println("I am in the loop: " + i); // Print the current value of i
        }
        System.out.println("Loop has been exited."); // Print a message after the loop is exited    
    }
}