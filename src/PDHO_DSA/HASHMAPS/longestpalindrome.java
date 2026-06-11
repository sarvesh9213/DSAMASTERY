//class Solution {
//    public int longestPalindrome(String s) {
//
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        for(int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
//        }
//
//        boolean odd = false;
//        int res = 0;
//
//        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
//
//            int val = entry.getValue();
//
//            if(val % 2 == 0) {
//                res += val;
//            }
//            else {
//                odd = true;
//                res += val - 1;
//            }
//        }
//
//        if(odd == false) {
//            return res;
//        }
//
//        return res + 1;
//    }
//}