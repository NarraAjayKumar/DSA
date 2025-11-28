import java.util.*;
public class Bubblesort01 {
    public static void Sort(int arr[]) {
        for(int turn = 0; turn<arr.length-1; turn++) {
            for(int j =0;j<arr.length-1-turn;j++) {
                if(arr[j]>arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void print(int arr[]) {
        for(int i = 0; i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int size = sc.nextInt();
        System.out.print("Enter the Array elements:");
        int arr[] = new int[size];
        for(int i= 0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
       Sort(arr);
       print(arr);

    }
}