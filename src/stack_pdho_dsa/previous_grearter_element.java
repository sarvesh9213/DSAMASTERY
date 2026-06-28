//package stack_pdho_dsa;
//
//public class previous_grearter_element {
//    class Solution {
//        public int[] previousGreaterElement(int[] arr) {
//            int n = arr.length;
//            int[] res = new int[n];
//            Stack<Integer> st = new Stack<>();
//
//            for (int i = 0; i < n; i++) {
//
//                while (!st.isEmpty() && st.peek() <= arr[i]) { // >= for the prev smaller 
//                    st.pop();
//                }
//
//                if (st.isEmpty()) {
//                    res[i] = -1;
//                } else {
//                    res[i] = st.peek();
//                }
//
//                st.push(arr[i]);
//            }
//
//            return res;
//        }
//    }
//}
