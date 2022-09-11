class Solution {
    public String[] findWords(String[] words) {
        Map<Character, Integer> row1 = new HashMap<>();
        row1.put('q', 1);
        row1.put('w', 1);
        row1.put('e', 1);
        row1.put('r', 1);
        row1.put('t', 1);
        row1.put('y', 1);
        row1.put('u', 1);
        row1.put('i', 1);
        row1.put('o', 1);
        row1.put('p', 1);
        row1.put('a', 2);
        row1.put('s', 2);
        row1.put('d', 2);
        row1.put('f', 2);
        row1.put('g', 2);
        row1.put('h', 2);
        row1.put('j', 2);
        row1.put('k', 2);
        row1.put('l', 2);
        row1.put('z', 3);
        row1.put('x', 3);
        row1.put('c', 3);
        row1.put('v', 3);
        row1.put('b', 3);
        row1.put('n', 3);
        row1.put('m', 3);
        int holder;
        int count = 0;
        String[] answer = new String[words.length];
        for (String s : words) {
            boolean row = true;
            holder = row1.get(Character.toLowerCase(s.charAt(0)));
            for (int i = 1; i < s.length(); i++) {
                if (holder != row1.get(Character.toLowerCase(s.charAt(i)))) {
                    row = false;
                }
            }
            if (row) {
                answer[count] = s;
                count++;
            }
        }
        int j = 0;
        String[] answer2 = new String[count];
        while (j < count) {
            if (answer[j] != null) {
                answer2[j] = answer[j];
            }
            j++;
        }
        return answer2;
    }
}