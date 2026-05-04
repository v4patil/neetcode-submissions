class Solution {
fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val res: HashMap<String, MutableList<String>> = HashMap()
    for (str in strs) {
        val count = IntArray(26)
        val arr = str.toCharArray()
        for (c in arr) {
            count[c - 'a']++
        }
        //val key = count.joinToString()// java 67.7 mb and kotlin 474.8 mb reason joinToString
//        val sb = StringBuilder()
//        for (i in 0 until 26) {
//            sb.append(count[i])
//        }
//        val key = sb.toString()//Still the same
        val key = Arrays.toString(count)
        res.putIfAbsent(key, ArrayList())
        res[key]!!.add(str)
    }
    return res.values.toList()
}
}
