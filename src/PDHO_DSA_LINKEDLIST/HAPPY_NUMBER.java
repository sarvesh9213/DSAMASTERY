package PDHO_DSA_LINKEDLIST;

public class HAPPY_NUMBER {

    // This function calculates the sum of squares of digits
    // Example:
    // 98 -> 9² + 8² = 81 + 64 = 145
    public static int getNext(int num) {

        int sum = 0;

        while (num > 0) {

            int digit = num % 10;   // Take last digit

            sum = sum + (digit * digit);

            num = num / 10;         // Remove last digit
        }

        return sum;
    }

    // Floyd's Cycle Detection
    public static boolean isHappy(int n) {

        int slow = n;
        int fast = n;

        while (fast != 1) {

            // Move slow by 1 step
            slow = getNext(slow);

            // Move fast by 2 steps
            fast = getNext(fast);
            fast = getNext(fast);

            // If they meet at a number other than 1,
            // a cycle exists -> Not Happy
            if (slow == fast && slow != 1) {
                return false;
            }
        }

        // Reached 1 -> Happy Number
        return true;
    }

    public static void main(String[] args) {

        int n = 98;

        boolean answer = isHappy(n);

        System.out.println(answer);
    }
}