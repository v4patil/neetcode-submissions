class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        if(s1.length > s2.length) return false

        val s1Freq = IntArray(26)
        val s2Freq = IntArray(26)

        for(i in s1.indices){
            s1Freq[s1[i] - 'a']++
            s2Freq[s2[i] - 'a']++
        }

        var left = 0

        for(right in s1.length until s2.length){
            if(s1Freq.contentEquals(s2Freq)){
                return true
            }
            s2Freq[s2[right] - 'a']++
            s2Freq[s2[left] - 'a']--
            
            left++
        }
        return s1Freq.contentEquals(s2Freq)
    }
}
