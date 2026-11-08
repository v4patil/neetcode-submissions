class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
    var set = HashSet<Char>()
    var left = 0
    var length = 0

    for(i in s.indices){
        while(set.contains(s[i])){
            set.remove(s[left])
            left++
        }
        set.add(s[i])
        length = maxOf(length, i - left+1)
    }
    return length
}
}
