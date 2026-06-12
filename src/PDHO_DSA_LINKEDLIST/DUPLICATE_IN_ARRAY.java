package PDHO_DSA_LINKEDLIST;
public class DUPLICATE_IN_ARRAY {

    public static int findDuplicate(int[] nums) {

        int slow = 0;
        int fast = 0;

        // Phase 1: Find Meeting Point
        while (true) {

            slow = nums[slow];

            fast = nums[fast];
            fast = nums[fast];

            if (slow == fast) {

                // Phase 2: Find Duplicate Number
                slow = 0;

                while (slow != fast) {

                    slow = nums[slow];
                    fast = nums[fast];
                }

                return slow;
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 4, 2, 2};

        int answer = findDuplicate(nums);

        System.out.println(answer);
    }
}