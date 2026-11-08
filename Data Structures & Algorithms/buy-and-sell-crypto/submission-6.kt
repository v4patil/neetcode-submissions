class Solution {
    fun maxProfit(prices: IntArray): Int {
    var profit = 0
    var minPrice = Integer.MAX_VALUE

    for(p in prices){
        if(p < minPrice){
            minPrice = p
        }else{
            profit = maxOf(profit, p-minPrice)
        }
    }
    return profit

}
}
