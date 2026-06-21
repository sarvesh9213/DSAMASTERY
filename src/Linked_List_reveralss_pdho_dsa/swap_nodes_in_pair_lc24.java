//package Linked_List_reveralss_pdho_dsa;
//
//public class swap_nodes_in_pair_lc24 {
//    class Solution {
//
//        // Reverse exactly "times" nodes starting from head
//        public void reverse(ListNode head, int times) {
//
//            ListNode curr = head;
//            ListNode prev = null;
//
//            while (times-- > 0) {
//
//                ListNode nex = curr.next;
//                curr.next = prev;
//                prev = curr;
//                curr = nex;
//            }
//        }
//
//        public ListNode swapPairs(ListNode head) {
//
//            if (head == null)
//                return null;
//
//            ListNode left = head;
//            ListNode right;
//            ListNode res = null;
//            ListNode prevleft = null;
//
//            int size = 2;
//
//            while (true) {
//
//                right = left;
//
//                // Move right to the 2nd node of current pair
//                for (int i = 0; i < size - 1; i++) {
//
//                    if (right == null)
//                        break;
//
//                    right = right.next;
//                }
//
//                // Complete pair found
//                if (right != null) {
//
//                    ListNode nextleft = right.next;
//
//                    // Reverse current pair
//                    reverse(left, size);
//
//                    // Connect previous reversed pair
//                    if (prevleft != null)
//                        prevleft.next = right;
//
//                    // left becomes tail after reversal
//                    prevleft = left;
//
//                    // First pair's new head
//                    if (res == null)
//                        res = right;
//
//                    // Move to next pair
//                    left = nextleft;
//                }
//
//                // Less than 2 nodes left
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
