class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int count = 0;
        double ans = 0.0;
        for (int num1 : nums1){
            nums[count] = num1;
            count += 1;
        }
        for (int num2 : nums2){
            nums[count] = num2;
            count += 1;
        }
        Arrays.sort(nums);
        if (count % 2 != 0){
            return nums[(count/2)];
        }
        if (count % 2 == 0){
            ans = (nums[count / 2] + nums[(count / 2) - 1]);
            ans = ans / 2;
        }
        return ans;
    }
}