//package Linked_List_reveralss_pdho_dsa;
//
//public class LL_REVERSAL_2 {
//    /**
//     * Definition for singly-linked list.
//     * public class ListNode {
//     *     int val;
//     *     ListNode next;
//     *     ListNode() {}
//     *     ListNode(int val) { this.val = val; }
//     *     ListNode(int val, ListNode next) {
//     *         this.val = val;
//     *         this.next = next;
//     *     }
//     * }
//     */
//
//    class Solution {
//
//        public ListNode reverseBetween(ListNode head, int left, int right) {
//
//            // If list has only one node or no reversal needed
//            if (head == null || left == right) {
//                return head;
//            }
//
//            ListNode t = head;
//            ListNode before = null;
//
//            int pos = 1;
//
//            // Move t to the left position
//            while (pos < left) {
//                before = t;
//                t = t.next;
//                pos++;
//            }
//
//            // Reverse from left to right
//            ListNode curr = t;
//            ListNode prev = null;
//            ListNode next = null;
//
//            int times = right - left + 1;
//
//            while (times-- > 0) {
//
//                next = curr.next;
//
//                curr.next = prev;
//
//                prev = curr;
//
//                curr = next;
//            }
//
//            // Connect last node of reversed part
//            t.next = curr;
//
//            // Connect first half with reversed part
//            if (before != null) {
//
//                before.next = prev;
//
//                return head;
//            }
//
//            // If reversal started from head
//            return prev;
//        }
//    }
//}
