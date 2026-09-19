class Solution {
    static int nCr(int n, int r) {
        if (r > n) {
            return 0;
        }

        r = Math.min(r, n - r);

        long result = 1;

        for (int i = 1; i <= r; i++) {
            result = result * (n - i + 1) / i;
        }

        return (int) result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna