import java.util.*;
public class Activityies01 {
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size of Start Array:");
    int n1 = sc.nextInt();
      System.out.println("Enter the Size of End Array:");
      int n2 = sc.nextInt();
      int start[] = new int[n1];
      int end[] = new int[n2];
      for(int i = 0; i<n1; i++) {
        start[i] = sc.nextInt();
      }
       System.out.print("This is Start Array");
      
      for(int i = 0; i<n2; i++) {
        end[i] = sc.nextInt();
      }
      System.out.print("This is End Array");
       
      // basis sort
      int maxAct = 0;
    ArrayList<Integer> ans = new ArrayList<>();
    maxAct = 1;
    ans.add(0);
    int lastend = end[0];
    for(int i = 1; i<end.length; i++) {
        if(start[i]>=lastend) {
            maxAct++;
            ans.add(i);
            lastend = end[i];
        }
    }
    System.out.println("MAx Activity:" +maxAct);
    for(int i = 0; i<ans.size(); i++) {
        System.out.print("A" +ans.get(i) +" ");
    }
    System.out.println();

    
}
}