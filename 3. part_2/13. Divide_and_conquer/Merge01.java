import java.util.*;
public class Merge01 {
    public static void print(int arr[]) {
        for(int i =0; i<arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void mergesort(int arr[], int st, int ei) {
        if(st>=ei) { // base case
            return;
        }
        int mid = st + (ei - st)/2;
        mergesort(arr,st,mid); // recursely sort left half
        mergesort(arr,mid+1,ei);// recursely sort right half
        merge(arr,st,mid,ei);// merge togther
    }
    public static void merge(int arr[], int st, int mid, int ei) {
        // (0,3)-4 (4,6) - 3  --> 6-0+1 = 7
        int temp[] = new int[ei-st+1];
        int i = st; // iteration  left part
        int j = mid + 1; // iteration right part
        int k = 0; // iteration for temp arr
        while(i<=mid && j<=ei) {
            if(arr[i]<arr[j]) {
                temp[k] = arr[i];
                i++; k++;
            }
            else {
                temp[k] = arr[j];
                j++; k++;
            }
        }
        //left part
        while(i<=mid) {
            temp[k++] = arr[i++];
        }
        while(j<=ei) {
            temp[k++] = arr[j++];
        }
        // copy into temp 
        for(k =0,i = st; k<temp.length; k++,i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array:");
        int size = sc.nextInt();
        System.out.println("Enter the Array elements:");
        int arr[] = new int[size];
        for(int i = 0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        mergesort(arr,0,arr.length-1);
        print(arr);
    }
}