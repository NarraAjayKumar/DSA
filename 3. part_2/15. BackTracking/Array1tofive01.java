import java.util.*;
public class Array1tofive01 {
    public static void print(int arr[]) {
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void checkarray(int arr[], int i, int val) {
        //base case
        if(i == arr.length) {
            print(arr);
            return;
        }
        //recurse case
        arr[i] = val;
        checkarray(arr,i+1,val+1);
        arr[i] = arr[i] - 2;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a the Size of Array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
      checkarray(arr,0,1);
      print(arr);
    }

}