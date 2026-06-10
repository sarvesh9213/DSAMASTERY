//import java.util.HashMap;
//
//class Solution {
//
//    public boolean canConstruct(String ransomNote, String magazine) {
//
//        HashMap<Character, Integer> need = new HashMap<>();
//        HashMap<Character, Integer> have = new HashMap<>();
//
//        // Count characters needed
//        for (int i = 0; i < ransomNote.length(); i++) {
//            char ch = ransomNote.charAt(i);
//            need.put(ch, need.getOrDefault(ch, 0) + 1);
//        }
//
//        // Count characters available
//        for (int i = 0; i < magazine.length(); i++) {
//            char ch = magazine.charAt(i);
//            have.put(ch, have.getOrDefault(ch, 0) + 1);
//        }
//
//        // Check if magazine has enough characters
//        for (Character ch : need.keySet()) {
//
//            int fNeed = need.get(ch);
//            int fHave = have.getOrDefault(ch, 0);
//
//            if (fHave < fNeed) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//}