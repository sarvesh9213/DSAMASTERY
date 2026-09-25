package PADHO_RURRSION;
class Solution {
    public int fibonaCCI(int n) {

        // Base cases
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        // Recursive calls
        int ans1 = fibonaCCI(n - 1);
        int ans2 = fibonaCCI(n - 2);

        return ans1 + ans2;
    }
}