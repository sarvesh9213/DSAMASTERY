//// GFG PER HAI YE
//class Solution {
//    public int longestKSubstr(String s, int k) {
//
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        int low = 0;
//        int ans = -1;
//
//        for (int high = 0; high < s.length(); high++) {
//
//            char ch = s.charAt(high);
//
//            // Add current character
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
//
//            // Too many unique characters
//            while (map.size() > k) {
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
//            }
//
//            // Exactly k unique characters
//            if (map.size() == k) {
//
//                int len = high - low + 1;
//
//                ans = Math.max(ans, len);
//            }
//        }
//
//        return ans;
//    }
//}