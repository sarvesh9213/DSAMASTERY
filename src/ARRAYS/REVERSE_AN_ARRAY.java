package ARRAYS;
import java.util.*;

public class REVERSE_AN_ARRAY {




        public static void reverse(int numbers[]) {
            int first = 0, last = numbers.length - 1;

            while (first < last) {
                // swap
                int temp = numbers[last];
                numbers[last] = numbers[first];
                numbers[first] = temp;

                first++;
                last--;
            }
        }

        public static void main(String[] args) {
            int numbers[] = {2, 4, 6, 8, 10};

            System.out.println("Before Reverse:");
            System.out.println(Arrays.toString(numbers));

            reverse(numbers);   // function call

            System.out.println("After Reverse:");
            System.out.println(Arrays.toString(numbers));
        }
    }


