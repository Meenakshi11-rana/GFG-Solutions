class Solution {
    static long nPr(int n, int r) {
        if (r > n) {
            return 0;
        }

        long result = 1;

        for (int i = 0; i < r; i++) {
            result *= (n - i);
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna