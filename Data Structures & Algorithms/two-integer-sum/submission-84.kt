class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
    val set: HashMap<Int,Int> = HashMap() //value, position

    for((index, value) in nums.withIndex()){
        val key = target - value
        if(set.contains(key)){
            val res = IntArray(2)
            res[0] = set.getValue(key)
            res[1] = index
            return res
        }
        set[value] = index
    }
    return intArrayOf()

}
}
