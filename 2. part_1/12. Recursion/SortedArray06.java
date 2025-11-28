import java.util.*;
public class SortedArray06 {
    public static boolean sorted(int arr[], int i) {
        if(i == arr.length -1) {
        return true;
        }
        if(arr[i] > arr[i + 1]) {
            return false;
        }
       return sorted(arr, i + 1);

    }
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of Array:");
    int size = sc.nextInt();
    System.out.println("Enter the Array elements:");
    int arr[] = new int[size];
    for(int i = 0; i<size; i++) {
        arr[i] = sc.nextInt();
    }
  System.out.println(sorted(arr,0));
    }
}