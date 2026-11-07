class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val map = HashMap<Int, Int>()
    val  freq = List(nums.size+1) {mutableListOf<Int>()}

    for (num in nums) {
        map.put(num, map.getOrDefault(num, 0) + 1)
    }

    for((num, count) in map){
        freq[count].add(num)
    }

    val res = mutableListOf<Int>()
    val index = 0;
    for(i in freq.size - 1 downTo 1){
        for(num in freq[i]){
            res.add(num)
            if(res.size == k){
                return res.toIntArray()
            }
        }
    }
    return res.toIntArray()
}

}
