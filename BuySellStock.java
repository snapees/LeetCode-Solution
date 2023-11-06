// using array

public class BuySellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int i = 0;
        while (i < n){
            minPrice = Math.min(minPrice, prices[i]);
            if (prices[i] >= minPrice){
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
            i++;
        }
        return maxProfit;

    }
}
