import java.util.ArrayList;
public class Operations02 {
public static void main(String args[]) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1); //O(1)
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    // To print 1 to 5
    System.out.println(list);
    // Operation 2 - Get Element O(1)
   int element = list.get(1);
    // To print index one element
    System.out.println(element); 
    // Operation 3 - Remove Element O(n)
    list.remove(2);
    System.out.println(list);
    // Operation 4 - Set an Element at index O(n)
    list.set(2,30);
    System.out.println(list);
    // Operation 5 - Contains an Element O(n)
   System.out.println(list.contains(1));
   System.out.println(list.contains(12));
   

}
}