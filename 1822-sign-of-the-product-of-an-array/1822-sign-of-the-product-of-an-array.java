class Solution {
    public int arraySign(int[] nums) {
        int negative = 0;

        for (int num : nums) {
            if (num == 0) {
                return 0;
            }

            if (num < 0) {
                negative++;
            }
        }

        if (negative % 2 == 0) {
            return 1;
        }

        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna