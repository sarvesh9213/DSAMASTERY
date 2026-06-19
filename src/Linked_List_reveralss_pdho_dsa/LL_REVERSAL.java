package Linked_List_reveralss_pdho_dsa;

public
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *
     *     ListNode() {}
     *     ListNode(int val) {
     *         this.val = val;
     *     }
     *     ListNode(int val, ListNode next) {
     *         this.val = val;
     *         this.next = next;
     *     }
     * }
     */

    class LL_REVERSAL {
        public ListNode reverseList(ListNode head) {

            ListNode curr = head;
            ListNode prev = null;

            while (curr != null) {

                ListNode next = curr.next; // store next node

                curr.next = prev;          // reverse link

                prev = curr;               // move prev forward

                curr = next;               // move curr forward
            }

            return prev; // new head of reversed list
        }
    }

