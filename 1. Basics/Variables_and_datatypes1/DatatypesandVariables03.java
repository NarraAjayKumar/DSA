public class DatatypesandVariables03 {
    public static void main(String args[]) {
        // Permutative data types
        int a = 10; // size is 4 bytes
        float b = 10.5f; // size is 4 bytes
        char ch = 'A'; // size is 2 bytes
        boolean c = true;  // size is 1 byte
        short d = 20; // size is 2 bytes
        long e = 10000000L; // size is 8 bytes
        double f = 3.14; // size is 8 bytes
        byte g = 6; // size is 1 byte
        System.out.println(a);
        System.out.println(b);
        System.out.println(ch);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        // Non-permutative data types
        System.out.println("Non-permutative data types:");
        String name = "Ajay"; // size is variable, depends on the length of the string
        System.out.println(name);
        // Non-permutative data types can be used to store complex data structures
        // like arrays, lists, and objects.
    }
}
    