class Solution {
    public int searchInsert(int[] nums, int target) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int count = 0;
        if (target < nums[0]){
            return 0;
        }
        if (target > nums[nums.length - 1]){
            return nums.length;
        }
        for (int num : nums){
            if (num == target){
                return count;
            }
            if (count > 0){
                if (num > target && nums[count - 1] < target){
                    return count;
                }
            }
            numbers.add(num);
            count += 1;
        }
        
        return count;
    }
}