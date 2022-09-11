class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> helper = new HashMap<>();
        for (int i : nums) {
            if (helper.containsKey(i)) {
                helper.put(i, 2);
            } else {
                helper.put(i, 1);
            }
        }
        for (int j : helper.keySet()) {
            if (helper.get(j) == 1) {
                return j;
            }
        }
        return 0;
    }
}