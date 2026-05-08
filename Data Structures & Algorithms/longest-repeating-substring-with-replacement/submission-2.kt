class Solution {
    fun characterReplacement(s: String, k: Int): Int {
    var left = 0
    var maxFreq = 0
    var maxLength = 0
    var arr = IntArray(26)

    for(right in s.indices){
        arr[s[right]- 'A']++
        maxFreq = maxOf(maxFreq, arr[s[right] - 'A'])

        while((right - left +1) - maxFreq > k){
            arr[s[left]- 'A']--
            left++
        }
        maxLength = maxOf(maxLength, right- left +1)
    }
    return maxLength

}
}
