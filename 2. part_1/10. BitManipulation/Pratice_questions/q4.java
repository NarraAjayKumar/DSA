public class q4 {
    public static void main(String args[]) {
        // Loop through uppercase letters A to Z using char
        for(char ch = 'A'; ch <= 'Z'; ch++) {
            // Convert each uppercase letter to lowercase by OR-ing with 32
            // Example: 'A' (65) | 32 = 'a' (97)
            // This works because in ASCII, lowercase letters differ by bit 6 (value 32)
            System.out.print((char)(ch | 32) + " "); // Add space between each character
        }
    }
}
