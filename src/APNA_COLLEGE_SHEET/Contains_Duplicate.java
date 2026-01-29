//class Solution {
//    public boolean containsDuplicate(int[] nums) {
//        int freq[] = new int[nums.length];
//        for ( int i = 0 ; i< nums.length -1 ; i++ ){
//            if ( freq[nums[i]] ==0){
//                freq[nums[i]]=1 ;
//            }
//            else {
//                freq[nums[i]]+=1;
//            }
//
//        }
//        boolean value = false ;
//        for ( int i  = 0 ; i< nums.length ; i++){
//            if ( freq [i]>1){
//                value = true ;
//                break ;
//            }
//        }
//        return value ;
//    }
//}