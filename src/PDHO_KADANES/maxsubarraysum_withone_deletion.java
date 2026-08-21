//class Solution {
//    public int maximumSum(int[] a) {
//
//        int n = a.length;
//
//        int nodelete = a[0];
//        int onedelete = Integer.MIN_VALUE;
//        int res = a[0];
//
//        for (int i = 1; i < n; i++) {
//
//            int prevNodelete = nodelete;
//            int prevOnedelete = onedelete;
//
//            nodelete = Math.max(prevNodelete + a[i], a[i]);
//
//            int v2;
//
//            if (prevOnedelete == Integer.MIN_VALUE)
//                v2 = a[i];
//            else
//                v2 = prevOnedelete + a[i];
//
//            onedelete = Math.max(v2, prevNodelete);
//
//            res = Math.max(res, Math.max(nodelete, onedelete));
//        }
//
//        return res;
//    }
//}