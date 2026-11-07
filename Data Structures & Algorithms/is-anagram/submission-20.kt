class Solution {
    fun isAnagram(s: String, t: String): Boolean {
    if(s.length != t.length){
        return false
    }
    val arr = IntArray(26)

    for(i in 0 until s.length){
        arr[s[i] - 'a']++
        arr[t[i] - 'a']--
    }

    arr.forEach{
        if(it != 0){
            return false
        }
    }
    return true
}
}
