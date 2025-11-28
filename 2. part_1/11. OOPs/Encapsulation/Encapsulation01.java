public class Encapsulation04 {
    public static void main(String args[]) {
        Student s1 =  new Student();
        s1.setage(10);
        s1.setname("Ajay");
        System.out.println(s1.getage());
        System.out.println(s1.name);

    }
}
class Student { // class name Student
    String name;
    private int age; // declare private variable age
    void setname(String new_name) {
        name = new_name;
    }
    //Getter Method
    int getage() {
        return age;
    }
    // This is setter Method
    public  void setage(int age) {
        // only set age if age is greaterthan zero
        if(age>0) {
            this.age = age;
        }
    }
}