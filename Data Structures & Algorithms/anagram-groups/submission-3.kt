class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val res: HashMap<String, MutableList<String>> = HashMap()
    for (str in strs) {
        val count = IntArray(26)
        val arr = str.toCharArray()
        for (c in arr) {
            count[c - 'a']++
        }
        val key = count.joinToString()
        res.putIfAbsent(key, ArrayList())
        res[key]!!.add(str)
    }
    return res.values.toList()
}
}
