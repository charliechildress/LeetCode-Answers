class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int a = cost[0];
        int b = cost[1];
        int temp = 0;
        for(int i = 2; i < cost.length; i++) {
            temp = Math.min(a, b) + cost[i];
            a = b;
            b = temp;
        }
        return Math.min(a,b);
    }
}