import java.util.*;
public class q1 {
    public static boolean repeat(int arr[]) {
        for(int i =0; i<arr.length; i++) {
            for(int j = i + 1; j<arr.length; j++) {
            if(arr[i]==arr[j]) {
            System.out.print("true");
           
            }
            break;
    
        }
        
    }
    System.out.println("False");
        return false ;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int size = sc.nextInt();
        System.out.println("Enter the Array elements:");
        int arr[] = new int[size];
        //output code
        for(int i = 0; i<size; i++) {
            arr[i] = sc.nextInt();
        } 
        repeat(arr);
    }
}