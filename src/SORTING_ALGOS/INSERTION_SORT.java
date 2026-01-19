package SORTING_ALGOS;

public class INSERTION_SORT {
    public static void INSERTION__SORTER( int []  arr) {
        for(int i = 1; i< arr.length; i++){
            int curr= arr[i];
            int prev = i-1;
            while ( prev >=0 && arr[prev]> curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr  ;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\n");

        }
    }

    public static void main(String[] args) {
      int []  arr = {768,32454,32545,3,4326};
      INSERTION__SORTER(arr);

    }
}
