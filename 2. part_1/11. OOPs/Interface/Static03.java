public class Static03 {
    public static void main(String args[]) {
        Student s = new Student();
        s.Schoolname = "Gitam";
        s.getName();
        System.out.println(s.Schoolname);

    }
}
class Student {
   static int returnpercentage(int math, int phy, int chem) {
    return (math + phy + chem)/3;
   }
    String name;
    int roll;
    static String Schoolname;
    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
}