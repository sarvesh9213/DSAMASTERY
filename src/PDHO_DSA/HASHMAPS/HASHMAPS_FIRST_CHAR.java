//package PDHO_DSA.HASHMAPS;
//
//public class HASHMAPS_FIRST_CHAR {
//    class Solution {
//        public int firstUniqChar(String s) {
//
//            int[] freq = new int[26];
//
//            // Count frequency
//            for (int i = 0; i < s.length(); i++) {
//                freq[s.charAt(i) - 'a']++;
//            }
//
//            // Find first character with frequency 1
//            for (int i = 0; i < s.length(); i++) {
//                if (freq[s.charAt(i) - 'a'] == 1) {
//                    return i;
//                }
//            }
//
//            return -1;
//        }
//    }
//}
//method 2
//class Solution {
//    public int firstUniqChar(String s) {
//
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            if (map.get(s.charAt(i)) == 1) {
//                return i;
//            }
//        }
//
//        return -1;
//    }
//}