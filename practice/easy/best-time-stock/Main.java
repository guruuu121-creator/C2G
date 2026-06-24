import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i=0;i<n;i++){
            prices[i] = sc.nextInt();
        }
        int minPrices = prices[0];
        int maxProfit = 0;
        for(int i=1;i<n;i++){
            if(prices[i]<minPrices){
                minPrices = prices[i];
            }else{
                maxProfit = Math.max(maxProfit,prices[i]-minPrices);
            }
        }
        System.out.println(maxProfit);
    }
}