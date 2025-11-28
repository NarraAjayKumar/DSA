import java.util.*;
public class ReverseArray06 {
    public static void Reverse(int numbers[]) {
        int first = 0;
        int last = numbers.length - 1;
        while(first<last) {
           int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;
            first++;
            last--;
        }

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int size = sc.nextInt();
        System.out.print("Enter the Array elements:");
        int numbers[] = new int[size];
        for(int i =0; i<size;i++) {
            numbers[i] = sc.nextInt();
        }
        Reverse(numbers);
        

System.out.println("Reversed Array: " + Arrays.toString(numbers));
    }
}