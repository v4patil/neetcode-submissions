class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
    val ans = IntArray(nums.size)

    var previous = 1
    for (i in 0 until nums.size) {
        ans[i] = previous
        previous = previous * nums[i]
    }

    var right = nums[nums.size - 1]
    for (i in nums.size - 2 downTo 0) {
        ans[i] = ans[i] * right
        right = right * nums[i]
    }
    return ans
}

}
