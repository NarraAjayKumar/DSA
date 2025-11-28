import java.util.*;
public class q2 {
    public static int search(int arr[], int key) {
       int low = 0;
       int high = arr.length - 1;
       while(low<=high) {
        int mid = (low + high)/2;
        if(arr[mid] == key) {
            return mid;
        }
        // left half
        if(arr[mid]>=key) {
            if(arr[low]<=key && arr[mid]>key) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
            //right half
            if(arr[high]>=key && arr[mid]<key)
            low = mid + 1;
        }
        else {
            high = mid - 1;
        }
       }
       return -1; // key not found
        }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int size = sc.nextInt();
        System.out.println("Enter the array elements:");
        int arr[] = new int[size];
      
        for(int i = 0; i<size; i++) {
            arr[i] = sc.nextInt();
             
        }
        System.out.print("Enter the key element:");
          int key = sc.nextInt();
        int index = search(arr,key);
        if(index == -1) {
            System.out.print("Element not found");
        }
        else {
            System.out.println("Element Found" +index);
        }

        
    }
}
