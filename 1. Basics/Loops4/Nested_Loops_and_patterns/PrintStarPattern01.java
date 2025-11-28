public class PrintStarPattern01 {
    public static void main(String args[]) {
        for(int i = 1; i<=5; i++) { // Outer loop for rows
            for(int j =1; j<=i; j++)  { // Inner loop for columns
                System.out.print("*"); // Print star without newline    
            }
            System.out.println(); // Move to the next line after printing stars in a row}
    }
}
}