//package PDHO_KADANES;
//
//public class maxsubarraysum {
//    class Solution {
//        public int maxSubArray(int[] a) {
//
//            int n = a.length;
//
//            int bestEnding = a[0];
//            int ans = a[0];
//
//            for (int i = 1; i < n; i++) {
//
//                int v1 = bestEnding + a[i];
//                int v2 = a[i];
//
//                bestEnding = Math.max(v1, v2);
//
//                ans = Math.max(ans, bestEnding);
//            }
//
//            return ans;
//        }
//    }
//}
