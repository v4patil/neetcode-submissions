class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val numSet = nums.toHashSet()
        var count = 0

        for (num in nums) {
            if(num-1 !in numSet){
                var currentNum = num
                var longest = 1

                while(currentNum +1 in numSet){
                    longest += 1
                    currentNum += 1   
                }
                count = maxOf(count, longest)
            }
        }
        return count    

    }
}
