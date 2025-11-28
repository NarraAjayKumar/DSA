public class One {
    public static void main(String args[]) {
        Student s = new Student();
        s.name();

    }
}
class College {
    String name;
    int fees;
    void name() {
        System.out.println("Gitam");
    }
    void fees() {
        System.out.println(20);
    }
}
class Student extends College {
    int roll;
    void roll() {
        System.out.println(1530);
    }
}
