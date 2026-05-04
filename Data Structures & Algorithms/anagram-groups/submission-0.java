class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String, List<String>> res = new HashMap<>();
            for (String str : strs) {
                char[] strCharArray = str.toCharArray();
                Arrays.sort(strCharArray);
                String sortedString = Arrays.toString(strCharArray);
                res.computeIfAbsent(sortedString, k -> new ArrayList<>()).add(str);
            }
            return new ArrayList<>(res.values());
        }
}
