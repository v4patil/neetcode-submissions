class Solution {
       public static String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";

        int[] freq = new int[128]; // ASCII characters

        // Step 1: frequency of characters in t
        for (char c : t.toCharArray()) {
            freq[c]++;
        }

        int left = 0, right = 0;
        int required = t.length();
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        // Step 2: sliding window
        while (right < s.length()) {
            char rChar = s.charAt(right);

            if (freq[rChar] > 0) {
                required--;
            }
            freq[rChar]--;
            right++;

            // Step 3: valid window found
            while (required == 0) {

                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }

                char lChar = s.charAt(left);
                freq[lChar]++;

                if (freq[lChar] > 0) {
                    required++;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }

}
