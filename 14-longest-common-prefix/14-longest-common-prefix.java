class Solution {
    public String longestCommonPrefix(String[] strs) {
        String answer = "";
        boolean prefix = true;
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            prefix = true;
            for (int j = 1; j < strs.length; j++) {
                if (i < strs[j].length()){
                    if (strs[j].charAt(i) != c) {
                    prefix = false;
                    return answer;
                    }
                } else {
                    prefix = false;
                    return answer;
                }
            }
            if (prefix) {
                answer += strs[0].substring(i, i + 1);
            }
        }
        return answer;
    }
}