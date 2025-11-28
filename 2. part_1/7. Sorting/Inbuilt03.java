import java.util.*;
public class Inbuilt03 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int size = sc.nextInt();
        System.out.print("Enter the Array elements:");
        int arr[] = new int[size];
        for(int i =0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
    Arrays.sort(arr);
    for(int i = 0; i<size; i++) {
        System.out.print(arr[i] +" ");
    }
    System.out.println("sorted Array is:" + java.util.Arrays.toString(arr));
        
    }
}