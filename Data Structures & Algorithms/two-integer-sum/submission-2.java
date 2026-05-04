class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int currentNum = nums[i];
            if(map.containsKey(target - currentNum)){
                return new int[]{map.get(target - currentNum), i};
            }else{
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
