//class Solution {
//
//    public boolean fun(int[] have, int[] need) {
//
//        for (int i = 0; i < 256; i++) {
//
//            if (have[i] < need[i]) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//
//    public String minWindow(String s, String t) {
//
//        int n = s.length();
//        int m = t.length();
//
//        int[] have = new int[256];
//        int[] need = new int[256];
//
//
//        // If s is smaller than t
//        if (n < m) {
//            return "";
//        }
//
//
//        // Store frequency of characters required from t
//        for (int i = 0; i < m; i++) {
//
//            need[t.charAt(i)]++;
//        }
//
//
//        int low = 0;
//
//        int res = Integer.MAX_VALUE;
//
//        int start = -1;
//
//
//        // Move high from left to right
//        for (int high = 0; high < n; high++) {
//
//            // Add current character into our window
//            have[s.charAt(high)]++;
//
//
//            // While current window contains everything required
//            while (fun(have, need)) {
//
//                int len = high - low + 1;
//
//
//                // Update minimum answer
//                if (res > len) {
//
//                    res = len;
//                    start = low;
//                }
//
//
//                // Remove character from left
//                have[s.charAt(low)]--;
//
//                // Shrink window
//                low++;
//            }
//        }
//
//
//        // If no valid window was found
//        if (res == Integer.MAX_VALUE) {
//            return "";
//        }
//
//
//        // Java substring(start, end)
//        return s.substring(start, start + res);
//    }
//}