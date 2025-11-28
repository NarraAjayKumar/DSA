import java.util.*;
public class Indiancoins03 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of coins:");
        int n = sc.nextInt();
        System.out.println("Enter the coins:");
        Integer coins[] = new Integer[n];
        int count = 0;
        for(int i = 0; i<n; i++) {
            coins[i] = sc.nextInt();
        }
        System.out.println("Enter the Amount:");
        int amount = sc.nextInt();
              ArrayList<Integer> ans = new ArrayList<>();
              Arrays.sort(coins,Collections.reverseOrder());
    for(int i = 0; i<coins.length; i++) {
        if(coins[i]<= amount) {
            while(coins[i]<= amount) {
                count++;
                ans.add(coins[i]);
                amount-=coins[i];
            }
        }
    }
    System.out.println("Total (min) Coins is:" +count);
    for(int i = 0; i<ans.size(); i++) {
        System.out.print(ans.get(i) +" ");
    }
    System.out.println();
       
    }
}