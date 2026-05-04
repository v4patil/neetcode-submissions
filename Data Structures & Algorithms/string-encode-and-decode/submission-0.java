class Solution {

    public static String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for(String str: strs){
            result.append(str.length())
                    .append("#")
                    .append(str);
        }
        return result.toString();
    }

    public static List<String> decode(String str) {
        ArrayList<String> decode = new ArrayList<>();
        int n = str.length();
        int i = 0;
        while(i < n){
            int len = 0;
            while (str.charAt(i) != '#') {
                len = len * 10 + (str.charAt(i) - '0');
                i++;
            }
            i++;
            String temp = str.substring(i, i + len);
            decode.add(temp);

            i += len;
        }
        return decode;
    }
}
