class Solution {
fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val res: HashMap<String, MutableList<String>> = HashMap()
    
    for(str in strs){
        val count = IntArray(26)
        str.forEach{
            count[it - 'a']++
        }
        val key = Arrays.toString(count)
        res.putIfAbsent(key, ArrayList())
        res[key]!!.add(str)
    }
    return res.values.toList()
}
}
