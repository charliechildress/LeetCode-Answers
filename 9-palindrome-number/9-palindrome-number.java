class Solution {
    public boolean isPalindrome(int x) {
        Long[] longArrayyyyy = new Long[135000];
        
        StringBuilder s1= new StringBuilder();
        s1.append(String.valueOf(x));
        return (String.valueOf(x).equals(s1.reverse().toString()));
    }
}