class Solution {
    public char repeatedCharacter(String s) {
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (count.containsKey(s.charAt(i))) {
                return s.charAt(i);
            } else {
                count.put(s.charAt(i), 1);
            }
        }
        return 'b';
    }
}