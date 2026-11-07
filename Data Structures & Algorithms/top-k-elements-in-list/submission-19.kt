class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val map : HashMap<Int, Int> = HashMap()//num, count
    val freq = List(nums.size+1){mutableListOf<Int>()}

    nums.forEach{
        map[it] = map.getOrDefault(it, 0) + 1
    }

    for((num, count) in map){
        freq[count].add(num)
    }

    val res = mutableListOf<Int>()
    for(freqList in freq.size-1 downTo 1){
        for(i in freq[freqList]){
           res.add(i)
           if(res.size == k){
                return res.toIntArray()
           }     
        }
    }
    return res.toIntArray()
}

}
