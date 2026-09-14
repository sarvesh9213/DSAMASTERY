//import java.util.*;
//
//public class Main {
//
//    static void fun(int[] a, int n, int idx, ArrayList<Integer> tmp) {
//
//        // Base case
//        if (idx == n) {
//            System.out.println(tmp);
//            return;
//        }
//
//        // Don't take a[idx]
//        fun(a, n, idx + 1, tmp);
//
//        // Take a[idx]
//        tmp.add(a[idx]);
//
//        fun(a, n, idx + 1, tmp);
//
//        // Backtrack
//        tmp.remove(tmp.size() - 1);
//    }
//
//    public static void main(String[] args) {
//
//        int[] a = {1, 2, 3};
//
//        ArrayList<Integer> tmp = new ArrayList<>();
//
//        fun(a, a.length, 0, tmp);
//    }
//}