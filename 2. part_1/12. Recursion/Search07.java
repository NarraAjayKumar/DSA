import java.util.*;
public class Search07 {
    public static int first(int arr[], int i, int key) {
        if(i == arr.length - 1) {
            return -1;
        }
        if(arr[i] == key) {
        return i;
        }
        return first(arr, i + 1,key);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int size = sc.nextInt();
        System.out.println("Enter the Array Elements:");
        int arr[] = new int[size];
        for(int i = 0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(first(arr,0,4));
    }
}