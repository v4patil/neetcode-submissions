class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        return nums
        .toList()
        .groupingBy{it}
        .eachCount()
        .entries
        .sortedByDescending{it.value}
        .take(k)
        .map{it.key}
        .toIntArray()
    }
}
