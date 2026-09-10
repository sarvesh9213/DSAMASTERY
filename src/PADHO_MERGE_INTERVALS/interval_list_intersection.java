//import java.util.*;
//
//class Solution {
//    public int[][] intervalIntersection(int[][] a, int[][] b) {
//
//        List<int[]> res = new ArrayList<>();
//
//        int n = a.length;
//        int m = b.length;
//
//        int i = 0;
//        int j = 0;
//
//        while (i < n && j < m) {
//
//            int start1 = a[i][0];
//            int end1 = a[i][1];
//
//            int start2 = b[j][0];
//            int end2 = b[j][1];
//
//            if (start1 <= start2) {
//
//                if (end1 >= start2) {
//
//                    int s = Math.max(start1, start2);
//                    int e = Math.min(end1, end2);
//
//                    res.add(new int[]{s, e});
//                }
//
//            } else {
//
//                if (end2 >= start1) {
//
//                    int s = Math.max(start1, start2);
//                    int e = Math.min(end1, end2);
//
//                    res.add(new int[]{s, e});
//                }
//            }
//
//            if (end1 <= end2) {
//                i++;
//            } else {
//                j++;
//            }
//        }
//
//        return res.toArray(new int[res.size()][]);
//    }
//}