class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val res = IntArray(nums.size)
        var left = 1

        for((index, num) in nums.withIndex()){
            res[index] = left
            left *= num
        }

        var right = nums[nums.size - 1]

        for(i in nums.size - 2 downTo 0){
            res[i] = res[i] * right
            right *= nums[i]
        }
        return res
    }

}
