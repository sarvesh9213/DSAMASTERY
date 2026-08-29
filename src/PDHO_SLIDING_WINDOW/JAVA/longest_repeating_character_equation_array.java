//class Solution {
//
//    public int findMax(int[] freq) {
//
//        int maxCount = -1;
//
//        for (int i = 0; i < 256; i++) {
//            maxCount = Math.max(maxCount, freq[i]);
//        }
//
//        return maxCount;
//    }
//
//
//    public int characterReplacement(String s, int k) {
//
//        int n = s.length();
//
//        int[] freq = new int[256];
//
//        int low = 0;
//        int ans = 0;
//
//
//        for (int high = 0; high < n; high++) {
//
//            // Add current character
//            char ch = s.charAt(high);
//
//            freq[ch]++;
//
//
//            // Find maximum frequency in current window
//            int maxCount = findMax(freq);
//
//
//            // Current window length
//            int len = high - low + 1;
//
//
//            // Number of characters we need to replace
//            int diff = len - maxCount;
//
//
//            // If we need more than k replacements,
//            // shrink the window
//            while (diff > k) {
//
//                char leftChar = s.charAt(low);
//
//                freq[leftChar]--;
//
//                low++;
//
//
//                // Calculate again after shrinking
//                maxCount = findMax(freq);
//
//                len = high - low + 1;
//
//                diff = len - maxCount;
//            }
//
//
//            // Current valid window
//            len = high - low + 1;
//
//            ans = Math.max(ans, len);
//        }
//
//        return ans;
//    }
//}