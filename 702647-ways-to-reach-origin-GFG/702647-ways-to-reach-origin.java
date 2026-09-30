class Solution {
    public int ways(int x, int y) {

        int MOD = 1000000007;

        long[][] dp = new long[x + 1][y + 1];

        // If y = 0, only left moves are possible
        for (int i = 0; i <= x; i++) {
            dp[i][0] = 1;
        }

        // If x = 0, only down moves are possible
        for (int j = 0; j <= y; j++) {
            dp[0][j] = 1;
        }

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % MOD;
            }
        }

        return (int) dp[x][y];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna