public class Typecasting10 {
    public static void main(String args[]) {
        char ch = 'A';
        int ch1 = ch; // Implicit typecasting from char to int
        int a = 66;
        char ch2 = (char)a; // Explicit typecasting from int to char
        System.out.println(ch2);
        System.out.println(ch1);
    }
}