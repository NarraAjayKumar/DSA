import java.util.*;
public class FractionalKnapsack02 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Items:");
        int n = sc.nextInt();
        int value[] = new int[n];
        int weight[] = new int[n];
        System.out.println("Enter the values:");
        for(int i = 0; i<n; i++) {
            value[i] = sc.nextInt();
        }
        System.out.println("Enter the Weight:");
        for(int i = 0; i<n; i++) {
            weight[i] = sc.nextInt();
        }
         System.out.println("Enter the Capacity:");
        int capacity = sc.nextInt();
        double ratio[][] = new double[value.length][3];// value.length is rows and 3-col
        for(int i = 0; i<value.length; i++) {
            ratio[i][0] = i; //-it is the create one obj col
            ratio[i][1] = value[i]/(double)weight[i];
        }
        //Sort
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int finalval = 0;
       for(int i = ratio.length-1; i>=0; i--) {
        int idx = (int)[i][0];
        if(capacity>=weight[idx]) {
            finalval += value[idx];
            capacity-= weight[idx];
        }

       }

    }
}