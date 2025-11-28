public class Typeofconstructor06 {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Ajay";
        s1.roll = 1530;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 98;
        s1.marks[2] = 80;
        Student s2 = new Student(s1);
        s2.password = "XYZ";
        s1.marks[2] = 100;
        for(int i = 0; i<3; i++) {
            System.out.println(s2.marks[i]);
        }
        
        

    }
}
class Student {
    int roll;
    String name;
    String password;
    int marks[];
    //Shallow Copy
  //  Student(Student s1) { // copy constructor
    //    marks = new int[3];
      //  this.name = s1.name;
        //this.roll = s1.roll;
        //this.password = s1.password;
        //this.marks = s1.marks;

   // }
   // Deep copy - changes/update - don't reflect
   Student(Student s1) { // copy constructor
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i = 0; i<marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }

    }

Student() {
    marks = new int[3];
System.out.println("Hello"); // Non- parametrized constructor
}
Student(int roll) {
    marks = new int[3];
    this.roll = roll; // parametrized constructor
}
}