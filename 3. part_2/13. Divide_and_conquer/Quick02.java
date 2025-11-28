import java.util.*;
public class Quick02 {
    public static void print(int arr[]) {
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void quicksort(int arr[], int st, int ei) {
        if(st>=ei) {
            return;
        }
        int pidx= partition(arr,st,ei);
        quicksort(arr,st,pidx);
        quicksort(arr,pidx + 1,ei);
    }
    public static int partition(int arr[], int st, int ei) {
        int pivot = arr[ei];
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
        quicksort(arr,0,arr.length-1);
    }
}