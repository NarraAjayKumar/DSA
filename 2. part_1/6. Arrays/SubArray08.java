import java.util.*;
public class SubArray08 {
    public static void subarray(int numbers[]) {
        for(int i =0; i<numbers.length; i++) {
            int curr = i;
            for(int j = i+1; j<numbers.length; j++) {
                int last = j;
                for(int k = curr; k<=last; k++) {
                    System.out.print(numbers[k] + " ");

                }
                System.out.println();
            }
            System.out.println();
           
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int size = sc.nextInt();
        System.out.print("Enter the Array elements:");
        int numbers[] = new int[size];
        for(int i =0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }
        subarray(numbers);
        int total = size*(size+1)/2;
        System.out.println("Total sub Arrays:" +total);
    }
}