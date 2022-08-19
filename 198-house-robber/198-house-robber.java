class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        if (nums.length == 1){
            return nums[0];
        }
        int a = nums[0];
        int b = Math.max(nums[0], nums[1]);
        int temp = 0;
        
        for (int i = 2; i < nums.length; i++){
            temp = Math.max(a + nums[i], b);
            a = b;
            b = temp;
        }
        return b;
    }
}