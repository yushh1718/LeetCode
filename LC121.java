// 121. Best Time to Buy and Sell Stock
public class LC121 {
    public static int profit(int[] prices){
        int buyPrice = Integer.MAX_VALUE; int maxProfit = 0;
        for (int i: prices){
            if (buyPrice < i){
                int profit = i - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else{
                buyPrice = i;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println("Maximum profit achieved is: "+profit(prices));
    }
}
