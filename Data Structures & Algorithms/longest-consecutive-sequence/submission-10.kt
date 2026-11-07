class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if(nums.isEmpty()){return 0}
        var maxLength = 0
        val set = nums.toHashSet()

        for(num in set){
            
            if(!set.contains(num - 1)){
                var currentNum = num
                var currentLength = 1

                while(set.contains(currentNum + 1)){
                    currentLength += 1
                    currentNum += 1    
                }

                maxLength = maxOf(maxLength, currentLength)
            }
        }
        return maxLength
    }
}
