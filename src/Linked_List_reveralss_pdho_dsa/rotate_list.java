//package Linked_List_reveralss_pdho_dsa;
//
//public class rotate_list {
//    class ListNode {
//        int val;
//        ListNode next;
//
//        ListNode(int val) {
//            this.val = val;
//        }
//    }
//
//
//        public static ListNode rotateRight(ListNode head, int k) {
//
//            if (head == null || head.next == null || k == 0) {
//                return head;
//            }
//
//            ListNode last = head;
//            int n = 1;
//
//            while (last.next != null) {
//                n++;
//                last = last.next;
//            }
//
//            k = k % n;
//
//            if (k == 0) {
//                return head;
//            }
//
//            ListNode t = head;
//            int count = 1;
//
//            while (count < (n - k)) {
//                t = t.next;
//                count++;
//            }
//
//            ListNode res = t.next;
//
//            t.next = null;
//            last.next = head;
//
//            return res;
//        }
//
//        public static void printList(ListNode head) {
//            while (head != null) {
//                System.out.print(head.val + " ");
//                head = head.next;
//            }
//            System.out.println();
//        }
//
//        public static void main(String[] args) {
//
//            // 1 -> 2 -> 3 -> 4 -> 5
//            ListNode head = new ListNode(1);
//            head.next = new ListNode(2);
//            head.next.next = new ListNode(3);
//            head.next.next.next = new ListNode(4);
//            head.next.next.next.next = new ListNode(5);
//
//            int k = 2;
//
//            head = rotateRight(head, k);
//
//            printList(head);
//        }
//    }
//}
