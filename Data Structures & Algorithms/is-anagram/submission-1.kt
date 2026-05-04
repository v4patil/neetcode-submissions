class Solution {
    fun isAnagram(s: String, t: String): Boolean {
    if(s.length != t.length){
        return false;
    }
    var arr: IntArray = IntArray(26)
    for(i in 0 until s.length){
        arr[s[i] - 'a']--
        arr[t[i] - 'a']++
    }
    for(num in arr){
        if(num != 0) 
            return false
    }
    return true
}
}
