class Solution {
    public boolean isValid(String s) {
        Stack<Character> check = new Stack<Character>();
        if (s.length() % 2 != 0) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                check.add(s.charAt(i));
            } else {
                if (check.isEmpty()){
                    return false;
                }
                if (s.charAt(i) == ')' && check.pop() != '('){
                    return false;
                } else if (s.charAt(i) == '}' && check.pop() != '{') {
                    return false;
                } else if (s.charAt(i) == ']' && check.pop() != '[') {
                    return false;
                }
            }
        }
        return check.isEmpty();
    }
}