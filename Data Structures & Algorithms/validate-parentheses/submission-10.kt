class Solution {
    fun isValid(s: String): Boolean {
    if(s.length % 2 == 1) return false;

    val stack: Stack<Char> = Stack()
    for(ch in s.toCharArray()){
        if(ch == '(' || ch == '{' || ch == '['){
            stack.push(ch)
        }else{
            if(stack.isEmpty()) return false
            val top = stack.pop()
            if ((ch == ')' && top != '(') ||
                (ch == '}' && top != '{') ||
                (ch == ']' && top != '[')
            ) {
                return false
            }
        }
    }
    return stack.isEmpty()
}
}
