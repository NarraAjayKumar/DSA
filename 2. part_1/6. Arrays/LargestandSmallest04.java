import java.util.*;
public class LargestandSmallest04 {
    public static int findLargest(int numbers[]) {
        int largest = numbers[0]; // assume first element is largest
        int smallest = numbers[0]; // assume first element is smallest
        for(int i = 1; i<numbers.length; i++) {
            if(numbers[i]> largest) {
                largest = numbers[i]; // update largest if current number is greater
            }
            if(numbers[i]<smallest) {
                smallest =numbers[i]; // update smallest if current number is smaller
                System.out.println("Smallest number in the array is: " + smallest); // print smallest number
            }

        }
        return largest; // return the largest number found
        
        
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array: ");
        int size = sc.nextInt(); // input size of the array
        int numbers[] = new int[size]; // create an array of given size
        System.out.println("Enter the elements of the array:");
        for(int i= 0;i<size; i++) {
            numbers[i] = sc.nextInt(); // input elements of the array
               }
        int largest =  findLargest(numbers); // find the largest number
        System.out.println("Largest number in the array is:" + largest);
        

    }
    
}