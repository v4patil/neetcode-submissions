class Solution {
    fun isPalindrome(s: String): Boolean {
        val newString = s.lowercase().filter{it.isLetterOrDigit()}
        return newString == newString.reversed()
    }
}
