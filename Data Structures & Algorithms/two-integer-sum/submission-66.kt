class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var set = mutableMapOf<Int, Int>() //value, position

        nums.forEachIndexed{position, value ->
            if(set.contains(target - value)){
                return intArrayOf(set[target-value]!!, position)
            }
            set[value] = position
        }
        return intArrayOf()
    }
}
