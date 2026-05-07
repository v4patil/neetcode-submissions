class Solution {
     public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        
        while(left < right){
            int w = right  - left;
            int minheight = Math.min(height[left], height[right]);
            int area = w * minheight;
            maxArea = Math.max(maxArea, area);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
        
    }
}
