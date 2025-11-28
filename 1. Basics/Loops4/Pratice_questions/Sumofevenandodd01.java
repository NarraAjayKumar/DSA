import java.util.*;
class Sumofevenandodd01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit:");
        int limit = sc.nextInt();
        int even_sum = 0;
        int odd_sum =0;
     
     for(int num = 0; num<=num; num++) {
            
            if(num%2==0) {
                even_sum = even_sum + num;
            }
            else {
                odd_sum = odd_sum + num;
            }
     }
     
        System.out.println("sum of even Numbers:" +even_sum);
        System.out.println("sum of odd Numbers:" +odd_sum);
    }
}
    