class Solution {
     public static int lengthOfLongestSubstring(String s) {
        int length = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            length = Math.max(length, right - left + 1);
        }
        return length;
    }
}
