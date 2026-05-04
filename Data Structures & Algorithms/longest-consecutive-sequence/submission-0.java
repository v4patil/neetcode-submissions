class Solution {
   public static int longestConsecutive(int[] nums) {
        if(nums == null) return 0;

        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int longest = 0;

        for(int val: set){
            if(!set.contains(val-1)){
                int streak = 1;
                int currentVal = val;
                while(set.contains(currentVal+1)){
                    currentVal +=1;
                    streak +=1;
                }
                longest = Math.max(streak, longest);
            }
        }
        return longest;
    }
}
