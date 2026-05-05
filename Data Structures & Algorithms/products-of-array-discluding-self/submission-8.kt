class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
    val n = nums.size
    val ans = IntArray(n)

    ans[0] = 1
    for (i in 1 until n) {
        ans[i] = ans[i - 1] * nums[i - 1]
    }

    var rightProduct = 1
    for(i in nums.size -1 downTo 0){
        ans[i] = ans[i] * rightProduct
        rightProduct *= nums[i]
    }
    return ans
}

}
