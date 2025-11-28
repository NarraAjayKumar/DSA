import java.util.ArrayList;
public class Max05 {
public static void main(String args[]) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1); //O(1)
    list.add(2);
    list.add(9);
    list.add(4);
    list.add(5);
    int max = Integer.MIN_VALUE;
    for(int i = 0; i<list.size(); i++) {
        if(max < list.get(i)) {
            max = list.get(i);
        }
    }
   System.out.println("The max number is:" +max); 
    
}
}