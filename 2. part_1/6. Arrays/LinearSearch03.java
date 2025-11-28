import java.util.*;
public class LinearSearch03 {
    public static int LinearSearch(int numbers[],  int key) {
        for(int i = 0; i<numbers.length; i++) {
            if(numbers[i] == key) {
                return i; // return the index if key is found
            }
           
        }
     return -1; // return -1 if key is not found
    }
    public static void main(String args[]) {
        int numbers[] = {1,2,3,4,8,10,12,14,17,18}; // array of numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key element:");
        int key = sc.nextInt(); // input key to search
        int index = LinearSearch(numbers,key);
        if(index == -1) {
            System.out.println("Key not found");
        }
        else {
            System.out.println("Key found:" + index);
        }

    }
}