//class Solution {
//    public int search(int[] nums, int target) {
//        int first = 0;
//        int last = nums.length-1;
//
//        while (first <= last) {
//            int mid = first + ( last - first )/2;
//
//            if ( nums [ mid ] == target ) {
//                return mid ;
//            }
//
//            if (nums[first] <= nums[mid]) { // it is was for the left sorted array
//                if (nums[first] <= target && target < nums[mid]) {
//                    last = mid - 1 ; // left waale mai sorting hogi
//                }
//                else {
//                    first = mid + 1; // yaa phir agr target beda hai toh right waale mai hogi
//                }
//            }
//            else { // right sorted array
//                if (nums[mid] < target && target <= nums[last]) {
//                    first = mid + 1 ; // right mai jaa rhe hai
//                }
//                else {
//                    last = mid - 1 ; // yaa phir lefgt mai search kero
//                }
//            }
//        }
//        return -1 ;
//    }
//}