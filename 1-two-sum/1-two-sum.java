class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> tester = new HashMap<>();
        int count = 0;
        int[] ans = new int[2];
        for(int integer : nums){
            if (tester.containsKey(integer)){
                ans[0] = tester.get(integer);
                ans[1] = count;
                return ans;
            }
            int needed = target - integer;
            tester.put(needed, count);
            count += 1;
        }
        return ans;
    }
}