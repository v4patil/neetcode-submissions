class Solution {
    fun maxArea(heights: IntArray): Int {
    var left = 0
    var right = heights.size - 1
    var maxArea = 0;
    
    while(left < right){
        val width = right - left
        val minHeight = Math.min(heights[left], heights[right])
        val area = width * minHeight
        maxArea = maxArea.coerceAtLeast(area)
        if(heights[left] > heights[right]){
            right--
        }else{
            left++
        }
    }
    return maxArea
}
}
