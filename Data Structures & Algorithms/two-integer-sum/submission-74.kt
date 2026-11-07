class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
    val set: HashMap<Int, Int> = HashMap()//value, position

    nums.forEachIndexed{index, value ->
        if(set.contains(target - value)){
            return intArrayOf(set.getValue(target - value), index)
        }

        set[value] = index
    }
    return intArrayOf()
}
}
