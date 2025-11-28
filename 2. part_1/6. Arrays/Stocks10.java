import java.util.*;
public class Stocks10 {
    public static int SellingandProfit(int prices[]) {
        int buy_price = Integer.MAX_VALUE; // +infinite or track lowest_price 
        int max_profit = 0;
        for(int i = 0; i<prices.length; i++) {
            if(buy_price<prices[i]) { // prices is nothing but selling price  
                int profit = prices[i] - buy_price;
                max_profit = Math.max(max_profit,profit);
            } 
            else {
            buy_price = prices[i];
        }
    }
        return max_profit;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Price:");
        int size = sc.nextInt();
        System.out.print("Enter the Prices:");
        int prices[] = new int[size];
        for(int i = 0; i<size; i++) {
            prices[i] = sc.nextInt();

        }
        System.out.println(SellingandProfit(prices));
    }
}