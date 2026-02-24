//class Solution {
//    public void nextPermutation(int[] A) {
//        int piv = -1 ;
//        int n= A.length;
//        // 1. finding the pivot element
//        for (int i = n-2 ; i>=0 ; i--){
//            if (A[i]<A[i+1]){
//                piv = i;
//                break ;
//            }
//        }
//        if ( piv == -1 ){
//            reverse(A,0,n-1);
//            return  ;
//        }
//        // 2. now swapping the the pivot with the right most my friend
//        for ( int i = n-1 ; i>piv ;i--){
//            if ( A[piv] < A[i]){
//                swap(A,piv,i);
//                break ;
//            }
//        }
//        // 3. swapping the rest of the elements from the pivot ke right to the end tek
//        reverse ( A, piv +1 , n-1 );
//    }
//    private static void reverse ( int [] A , int i ,int j){
//        while ( i < j){
//            swap ( A,i,j);
//            i++;
//            j--;
//        }
//    }
//    private static void swap ( int []A ,int i , int j){
//        int temp =  A[j] ;
//        A[j] =  A[i] ;
//        A[i] = temp ;
//    }
//}