class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++) {
            int val = target -  nums[i];
            if(map.containsKey(val)) {
                res[0] = map.get(val);
                res[1] = i;
                return res;
            }else{
                map.put(nums[i], i);
            }
        }
        return res;
    }
}
