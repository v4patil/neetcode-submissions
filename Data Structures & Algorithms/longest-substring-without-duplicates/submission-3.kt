class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
    val set = HashSet<Char>()
    var left = 0
    var length = 0
    for(right in s.indices){
        while(set.contains(s[right])){
            set.remove(s[left])
            left++
        }
        set.add(s[right])
        length = maxOf(length, right-left +1)
    }
    return length
}
}
