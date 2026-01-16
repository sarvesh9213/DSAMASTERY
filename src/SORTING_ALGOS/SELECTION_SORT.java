package SORTING_ALGOS;

public class SELECTION_SORT {
    public static void SLECTION_SORTING(int [] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int minposition= i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[minposition]> arr[j]){
                    minposition=j;
                }
            }
            // swap with the minposition
            int temp = arr[minposition];
            arr[minposition]= arr[i]  ;
            arr[i]=temp;

        }

    }
    public static void main(String[] args) {
        int [ ] arr = {5,4,1,3,2 };
        SLECTION_SORTING(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }

    }
}
