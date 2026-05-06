class Solution {
    fun isPalindrome(s: String): Boolean {
    var start = 0
    var end = s.length -1
    val str = s.lowercase()
    while(start < end){
        while(start < end && !str[start].isLetterOrDigit() ){
            start++
        }
        while(start < end && !str[end].isLetterOrDigit() ){
            end--
        }

        if(str[start] != str[end]){
            return false
        }
        start++
        end--
    }
    return true

}
}
