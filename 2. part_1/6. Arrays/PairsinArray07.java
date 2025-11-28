import java.util.*;
public class PairsinArray07 {
    public static void pairs(int numbers[] ) {
     
        for(int i= 0; i<numbers.length;i++) { // outer loop
            int curr = numbers[i];
            for(int j = i+1; j<numbers.length; j++) { // inner loop
                System.out.print("[" + curr + "," + numbers[j] + "]");
            }
            System.out.println();
            
        }
        
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of Array:");
        int size = sc.nextInt();
        System.out.print("Enter the Array elements:");
        int numbers[] = new int[size];
        
        for(int i =0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }
        pairs(numbers);

   int total = size*(size-1) / 2;
   System.out.print(total);
    }
    
}