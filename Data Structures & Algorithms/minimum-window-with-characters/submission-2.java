class Solution {
        public static String minWindow(String s, String t) {
        if(s.length() < t.length()) return "";

        int[] arr = new int[126];

        for(char c : t.toCharArray()){
            arr[c]++;
        }
        
        int left = 0; int right =0;
        int minLength = Integer.MAX_VALUE;
        int required = t.length();
        int start  = 0;
        
        while(right < s.length()){
            char rChar = s.charAt(right);
            
            if(arr[rChar] > 0){
                required--;
            }
            arr[rChar]--;
            right++;
            
            while(required == 0){
                if(right - left < minLength){
                    minLength = right - left;
                    start = left;
                }
                char lChar = s.charAt(left);
                arr[lChar]++;
                if(arr[lChar] > 0){
                    required++;
                }
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);
    }


}
