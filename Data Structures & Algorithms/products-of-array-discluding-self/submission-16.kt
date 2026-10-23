class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val size = nums.size
        val result = IntArray(size){1}

        var suffix = 1

        for(i in 0 until size){
            result[i] = suffix
            suffix *= nums[i]
        }

        var prefix = 1

        for(i in size-1 downTo 0){
            result[i]*= prefix
            prefix *= nums[i]
        }
        return result
    }
    
}
