class Solution {
fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val res: HashMap<String, MutableList<String>> = HashMap()
    for (str in strs) {
        val array = IntArray(26)
        str.forEach { char ->
            array[char - 'a']++
        }

        val key = Arrays.toString(array)
        res.putIfAbsent(key, ArrayList())
        res[key]!!.add(str)
    }
    return res.values.toList()
}
}
