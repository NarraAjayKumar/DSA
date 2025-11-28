import java.util.*;
public class TrappingWater09 {
    public static int Trapping(int height[],int size) {
        // calculate the left max boundary Array
        int leftMax[] = new int[size];
        leftMax[0] = height[0];
        for(int i = 1; i<size; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        // calculate the right max boundary Array
        int rightMax[] = new int[size];
        rightMax[size-1] = height[size-1];
        for(int i = size -2; i>=0; i++) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        //loop 
        int trapped_water = 0;
        for(int i =0; i<size; i++) {
            //calculate min of the rightMax and leftMax
            int water_level = Math.min(leftMax[i], rightMax[i]);
            //calculate trapped water
            trapped_water = (water_level - height[i])*1; // where width is 1

        }
        return trapped_water;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Heights sizes");
        int size = sc.nextInt();
        System.out.print("Enter the height:");
        int height[] = new int[size];
        for(int i = 0; i<size; i++) {
            height[i] = sc.nextInt();
        }
         int totalTrapped = Trapping(height, size);
        System.out.println(totalTrapped);
         System.out.println("Heights = " + Arrays.toString(height));
    System.out.println("Total Trapped Water: " + totalTrapped);
    }
} // output i am getting error