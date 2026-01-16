package SORTING_ALGOS;

public class BUBBLE_SORT {
    public static void BUUBLESORTING(int [] arr) {
        for ( int turn = 0 ; turn < arr.length-1; turn ++){
            boolean swappped = false ;
            for ( int j = 0 ; j< arr.length-1-turn; j++){
                if( arr[j]> arr[j+1]){
                    //swappppppp
                    int temp = arr[j+1];
                    arr[j+1]= arr[j];
                    arr[j]= temp;
                    // also swapped so
                    swappped= true;
                }
            }
            if (!swappped){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,2,3,4,1} ;
        BUUBLESORTING(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
