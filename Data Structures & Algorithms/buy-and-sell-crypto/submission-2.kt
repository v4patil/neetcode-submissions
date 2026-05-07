class Solution {
    fun maxProfit(prices: IntArray): Int {
    var profit = 0
    var minPrice = Integer.MAX_VALUE
    for(price in prices){
        if(price < minPrice){
            minPrice = price
        }else{
            profit = maxOf(profit, price-minPrice)
        }
    }
    return profit
}
}
