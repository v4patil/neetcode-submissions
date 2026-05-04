class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
    val set: HashMap<Int, Int> = HashMap()
    for ((i, n) in nums.withIndex()) {
        val k: Int = target - n
        if (set.containsKey(k)) {
            val res = IntArray(2)
            res[0] = set.getValue(k)
            res[1] = i
            return res;
        } else {
            set[n] = i
        }
    }
    return intArrayOf()
}
}
