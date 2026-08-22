//import java.util.*;
//
//class Solution {
//    public int totalFruit(int[] fruits) {
//
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        int low = 0;
//        int ans = 0;
//
//        for (int high = 0; high < fruits.length; high++) {
//
//            // Add current fruit
//            map.put(fruits[high],
//                    map.getOrDefault(fruits[high], 0) + 1);
//
//            // More than 2 fruit types
//            while (map.size() > 2) {
//
//                int leftFruit = fruits[low];
//
//                map.put(leftFruit,
//                        map.get(leftFruit) - 1);
//
//                if (map.get(leftFruit) == 0) {
//                    map.remove(leftFruit);
//                }
//
//                low++;
//            }
//
//            // Current window is valid
//            int len = high - low + 1;
//
//            ans = Math.max(ans, len);
//        }
//
//        return ans;
//    }
//}