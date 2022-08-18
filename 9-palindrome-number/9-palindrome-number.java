class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        StringBuilder s1= new StringBuilder();
        s1.append(s);
        return (s.equals(s1.reverse().toString()));
    }
}