class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> help1 = new HashMap<>();
        for (int i : nums) {
            if (help1.containsKey(i)){
                return i;
            } else {
                help1.put(i, 0);  
            }   
        }
        return -1;
    }
}