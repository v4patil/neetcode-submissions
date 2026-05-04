class Solution {
       public static int maxProfit(int[] prices) {
        int profit = 0;
        int min = Integer.MAX_VALUE;
        for (int price: prices) {
            if (price < min) {
                min = price;
            } else {
                profit = Math.max(profit, price - min);
            }
        }
        return profit;
    }
}
