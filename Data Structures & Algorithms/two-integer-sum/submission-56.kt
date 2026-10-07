class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val set = mutableMapOf<Int, Int>() // value, position

        for(i in nums.indices){
        if(set.containsKey(target - nums[i])){
                return intArrayOf(set[target - nums[i]]!!, i)
            }
            //else{
                set[nums[i]] = i
                            //}
        }
        return intArrayOf()
    }
}
