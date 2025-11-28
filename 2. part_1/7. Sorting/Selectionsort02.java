import java.util.*;
public class Selectionsort02 {
    public static void Selection(int arr[]) {
        for(int i =0;i<arr.length-1;i++) {
            int minpos = i;
            for(int j = i+1;j<arr.length;j++) {
                if(arr[minpos]>arr[j]) { // you put lessthan means it print dec order other you put greaterthan means Ascending order
                minpos = j;
            }
        
        }
        //swap
        int temp = arr[minpos];
        arr[minpos] = arr[i];
        arr[i] = temp;
    }
}
public static void print(int arr[]) {
    for(int i = 0;i<arr.length;i++) {
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
        for(int i =0; i<size;i++) {
            arr[i] = sc.nextInt();
        }
        Selection(arr);
        print(arr);
    }
}