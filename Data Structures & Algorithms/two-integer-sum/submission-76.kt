class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
    val set: HashMap<Int, Int> = HashMap()

    nums.forEachIndexed{index, value ->
        if(set.contains(target - value)){
           return intArrayOf(set.getValue(target-value), index)     
        }
        set[value] = index
    }
    return intArrayOf()
}
}
