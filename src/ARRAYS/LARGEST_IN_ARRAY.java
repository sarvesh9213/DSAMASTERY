package ARRAYS;
import java.util.*;

public class LARGEST_IN_ARRAY {
    


    // Largest Number in Array


        public static int getLargest(int numbers[]) {
            int largest = Integer.MIN_VALUE;   // -infinity

            for(int i = 0; i < numbers.length; i++) {
                if(largest < numbers[i]) {
                    largest = numbers[i];
                }
            }
            return largest;
        }

        public static void main(String args[]) {

            int numbers[] = {1, 2, 6, 3, 5};

            int result = getLargest(numbers);
            System.out.println("Largest number is: " + result);
        }
    }


