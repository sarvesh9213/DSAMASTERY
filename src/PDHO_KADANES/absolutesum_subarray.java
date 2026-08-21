//class Solution {
//    public int maxAbsoluteSum(int[] nums) {
//
//        // Maximum subarray sum
//        int bestending = nums[0];
//        int ans1 = nums[0];
//
//        for (int i = 1; i < nums.length; i++) {
//            bestending = Math.max(bestending + nums[i], nums[i]);
//            ans1 = Math.max(ans1, bestending);
//        }
//
//        // Reset for minimum subarray sum
//        bestending = nums[0];
//        int ans2 = nums[0];
//
//        for (int i = 1; i < nums.length; i++) {
//            bestending = Math.min(bestending + nums[i], nums[i]);
//            ans2 = Math.min(ans2, bestending);
//        }
//
//        return Math.max(ans1, Math.abs(ans2));
//    }
//}