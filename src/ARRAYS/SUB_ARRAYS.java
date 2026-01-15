package ARRAYS;

public class SUB_ARRAYS {

    public static int findLargest(int arr[]) {
        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findSmallest(int arr[]) {
        int min = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
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
                        System.out.print(numbers[k] + " ");
                        sum += numbers[k];
                       if(k == end){
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


