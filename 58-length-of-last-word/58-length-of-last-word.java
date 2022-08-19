class Solution {
    public int lengthOfLastWord(String s) {
        String[] helper = s.split(" ");
        for (int i = helper.length - 1; i >= 0; i--){
            if (!helper[i].contains(" ")){
                return helper[i].length();
            }
        }
        return 0;
    }
}