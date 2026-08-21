//class Solution {
//    public int maxSubarraySumCircular(int[] nums) {
//        int n = nums.length;
//        int sum = 0;
//        for (int num : nums) sum += num;
//
//        int bestending = nums[0];
//        int ans1 = nums[0];
//        for (int i = 1; i < n; i++) {
//            bestending = Math.max(bestending + nums[i], nums[i]);
//            ans1 = Math.max(ans1, bestending);
//        }
//
//        // if all numbers are negative, circular case is invalid — return normal Kadane's result
//        if (ans1 < 0) return ans1;
//
//        bestending = nums[0];
//        int ans2 = nums[0];
//        for (int i = 1; i < n; i++) {
//            bestending = Math.min(bestending + nums[i], nums[i]);
//            ans2 = Math.min(ans2, bestending);
//        }
//
//        int circularkaden = sum - ans2;
//        return Math.max(ans1, circularkaden);
//    }
//}