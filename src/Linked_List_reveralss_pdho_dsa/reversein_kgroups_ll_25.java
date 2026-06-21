//package Linked_List_reveralss_pdho_dsa;
//
//public class reversein_kgroups_ll_25 {
//    class Solution {
//
//        public void reverse(ListNode head, int times) {
//            ListNode curr = head;
//            ListNode prev = null;
//
//            while (times-- > 0) {
//                ListNode nex = curr.next;
//                curr.next = prev;
//                prev = curr;
//                curr = nex;
//            }
//        }
//
//        public ListNode reverseKGroup(ListNode head, int k) {
//
//            if (head == null)
//                return null;
//
//            ListNode left = head;
//            ListNode right;
//            ListNode res = null;
//            ListNode prevleft = null;
//
//            while (true) {
//
//                right = left;
//
//                // move right k-1 times
//                for (int i = 0; i < k - 1; i++) {
//
//                    if (right == null)
//                        break;
//
//                    right = right.next;
//                }
//
//                if (right != null) {
//
//                    ListNode nextleft = right.next;
//
//                    reverse(left, k);
//
//                    if (prevleft != null)
//                        prevleft.next = right;
//
//                    prevleft = left;
//
//                    if (res == null)
//                        res = right;
//
//                    left = nextleft;
//                }
//                else {
//
//                    if (prevleft != null)
//                        prevleft.next = left;
//
//                    if (res == null)
//                        res = left;
//
//                    break;
//                }
//            }
//
//            return res;
//        }
//    }
//}
