import java.util.ArrayList;
public class Creation01 {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Object> mixed = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        //You can use ArrayList<Object>, because in Java every class inherits from Object.
        mixed.add("Ajay");
        mixed.add(6);
        mixed.add("I love my family");
        mixed.add(6.5);
        list.add(10);   // adds 10 to the list
        list.add(20);   // adds 20
        list1.add(20);   // adds 20
        System.out.println(list); // [10, 20]
        System.out.println(list1); // [20]
        System.out.println(mixed);

    }
}