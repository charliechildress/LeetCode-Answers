class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder s1= new StringBuilder();
        s1.append(String.valueOf(x));
        return (String.valueOf(x).equals(s1.reverse().toString()));
    }
}