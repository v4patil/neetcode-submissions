class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
    val res: MutableList<List<Int>> = ArrayList()
    nums.sort()

    for (i in nums.indices) {
        if (nums[i] > 0) {
            break
        }
        if (i > 0 && nums[i] == nums[i - 1]) {
            continue
        }
        var left = i + 1
        var right = nums.size - 1

        while (left < right) {
            val sum = nums[i] + nums[left] + nums[right]
            if (sum == 0) {
                res.add(listOf(nums[i], nums[left], nums[right]))
                while (left < right && nums[left] == nums[left + 1]) {
                    left++
                }
                while (left < right && nums[right] == nums[right - 1]) {
                    right--
                }
                left++
                right--
            } else if (sum > 0) {
                right--
            } else {
                left++
            }
        }
    }
    return res
}
}
