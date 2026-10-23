class Solution {

    fun encode(strs: List<String>): String {
        return strs.joinToString(""){"${it.length}#$it"}
    }

    fun decode(str: String): List<String> {
        val result = mutableListOf<String>()
        var i = 0
        while(i < str.length){
           val delimiter = str.indexOf("#", i)
           val length = str.substring(i, delimiter).toInt()
           i = delimiter + 1

           result.add(str.substring(i, i + length))
           i = i+length     
        }
        return result
    }
}
