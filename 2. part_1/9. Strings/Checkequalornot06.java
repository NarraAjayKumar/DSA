public class Checkequalornot06 {
    public static void main(String args[]) {
        String s1= "Ajay";
        String s2= "Ajay";
        String s3= new String("Ajay");
        if(s1 == s2) {
            System.out.println("s1 and s2 is equal!");
        }
        else {
            System.out.println("s1 and s2 not equal!");
        }
        if(s1 == s3) {
            System.out.println("s1 and s3 is equal!");
        }
        else {
            System.out.println("s1 and s3 is not equal!");
        }
        if(s1.equals(s3)) {
            System.out.println("s1 and s3 is equal!");
        }
        else {
        System.out.println("s1 and s3 is not equal!");
        }

    }
}