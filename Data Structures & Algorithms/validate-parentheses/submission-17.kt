class Solution {
    fun isValid(s: String) : Boolean {
    if(s.length % 2 != 0){
        return false
    }
    val stack = Stack<Char>()

    for(char in s){
        if(char == '(' || char == '[' || char == '{'){
            stack.add(char)
        }else{
            if(stack.isEmpty()){
                return false
            }
            val topElement = stack.pop()
            if(
                char == ')' && topElement == '(' ||
                char == ']' && topElement == '[' ||
                char == '}' && topElement == '{' 
            ){

            }else{
                return false
            }
        }
    }
    return stack.isEmpty()    
    
    }
}
