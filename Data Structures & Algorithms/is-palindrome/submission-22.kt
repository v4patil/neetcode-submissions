class Solution {
  
fun isPalindrome(s: String): Boolean {
    val plainString = s
    .filter{it.isLetterOrDigit()}
    .lowercase()
    return plainString.equals(plainString.reversed())
}
}
