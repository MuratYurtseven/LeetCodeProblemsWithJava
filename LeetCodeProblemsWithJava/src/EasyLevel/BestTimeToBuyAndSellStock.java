package EasyLevel;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if(buyPrice>prices[i]){
                buyPrice = prices[i];
            }

            profit = Math.max(profit,prices[i] - buyPrice);
        }
        return profit;
    }

    /*
    //Time Limit Exceeded
    public static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j <prices.length ; j++) {
                if(prices[i] < prices[j]){
                    if((prices[j] - prices[i]) > profit){
                        profit = prices[j] - prices[i];
                    }
                }
            }
        }
        return profit;
    }
*/

    public static void main(String[] args) {
        int[] arr = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
