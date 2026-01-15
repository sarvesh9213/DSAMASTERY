package ARRAYS;

public class sub_array_MAX_MIN {

    public static int findLargest(int arr[]) {
        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("largest of this array is "+ max);;
        return max;
    }

    public static int findSmallest(int arr[]) {
        int min = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("smallest of this array is "+ min);;
        return min;
    }


    public static void printSubarrays(int numbers[]) {

        int ts = 0; // total subarrays

        for(int i = 0; i < numbers.length; i++) {
            int start = i;

            for(int j = i; j < numbers.length; j++) {
                int end = j;
                int sum = 0;
                for(int k = start; k <= end; k++) {
                    int [] arr = new int[numbers.length];
                    System.out.print(numbers[k]+"\n");
                    for(int l = 0 ; l<=end ; l++){
                        arr [l]= numbers[k];
                    }
                    sum += numbers[k];
                    if(k == end){
                        findLargest(arr);
                        findSmallest(arr);
                        System.out.println("sum of this subarray: "+ sum);
                    }
                }

                ts++;
                System.out.println(); // new line after each subarray
            }
            System.out.println(); // blank line after each starting point
        }

        System.out.println("Total Subarrays = " + ts);
    }

    public static void main(String[] args) {

        int numbers[] = {2, 4, 6, 8};

        printSubarrays(numbers);
    }
}


