import java.util.*;
public class Searchlast08 {
    public static int last(int arr[], int i, int key) {
        if(i == arr.length) {
            return -1;
        }
        int isfound = last(arr, i + 1, key);
        if(isfound != -1) {
            return isfound;         
        }
        // check with self
        if(arr[i] == key) {
            return i;
        }
        return -1;
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
        System.out.print(last(arr,0,5));
    }
}