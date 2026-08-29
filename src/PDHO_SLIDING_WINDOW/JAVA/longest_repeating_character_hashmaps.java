//class Solution {
//    public int characterReplacement(String s, int k) {
//
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        int low = 0;
//        int ans = 0;
//
//        for (int high = 0; high < s.length(); high++) {
//
//            char ch = s.charAt(high);
//
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
//
//            // Find maximum frequency
//            int maxCount = 0;
//
//            for (int value : map.values()) {
//                maxCount = Math.max(maxCount, value);
//            }
//
//            int len = high - low + 1;
//
//            while (len - maxCount > k) {
//
//                char leftChar = s.charAt(low);
//
//                map.put(leftChar, map.get(leftChar) - 1);
//
//                if (map.get(leftChar) == 0) {
//                    map.remove(leftChar);
//                }
//
//                low++;
//
//                // Recalculate max frequency
//                maxCount = 0;
//
//                for (int value : map.values()) {
//                    maxCount = Math.max(maxCount, value);
//                }
//
//                len = high - low + 1;
//            }
//
//            ans = Math.max(ans, high - low + 1);
//        }
//
//        return ans;
//    }
//}