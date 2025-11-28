import java.util.*;
public class BinarySearch05 {
    public static int Binary_s(int numbers[], int key,int size) {
        int start = 0;
        int end = size -1;
        while(start<=end) {
        int mid = (start+end)/2;
        // comparization 
        if(numbers[mid] == key) {
            return mid;
        }
       if(numbers[mid]<key) { // right
        start = mid + 1;
       }
       else {
        end = mid -1;
       }
        }
        return -1;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size = sc.nextInt();
        System.out.println("Enter the array elements:");
        int numbers[] = new int[size];
        
       for(int i =0; i<size; i++) {
        numbers[i] = sc.nextInt();
        

       }
       System.out.print("Enter a key:");
        int key = sc.nextInt();
       int result = Binary_s(numbers,key,size);
       if(result == -1) {
        System.out.println("Key not found");
       }
       else {
        System.out.println("Key found:" + result);
       }
       
        }
        

    }
