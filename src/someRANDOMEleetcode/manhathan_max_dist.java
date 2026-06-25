//package someRANDOMEleetcode;
//
//public class manhathan_max_dist {
//    class Solution {
//        public int maxDistance(String moves) {
//            int x = 0, y = 0, wild = 0;
//            for (int i = 0; i < moves.length(); i++) {
//                char c = moves.charAt(i);
//                if (c == 'U') {
//                    y++;
//                } else if (c == 'D') {
//                    y--;
//                } else if (c == 'R') {
//                    x++;
//                } else if (c == 'L') {
//                    x--;
//                } else { // c == '_'
//                    wild++;
//                }
//            }
//            return Math.abs(x) + Math.abs(y) + wild;
//        }
//    }
//}
