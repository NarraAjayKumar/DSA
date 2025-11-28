public class Continue01 {
    public static void main(String args[]) {
        for(int i = 1; i<=5; i++) {
            if(i==4) {
                continue; // Skip the rest of the loop when i equals 4
            }
            System.out.println(i);// Print the current value of i
        }
    }
}