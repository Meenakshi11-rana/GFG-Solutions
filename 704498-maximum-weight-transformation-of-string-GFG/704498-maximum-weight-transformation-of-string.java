class Solution {
    public int getMaxWeight(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            // Leave the current character unpaired
            dp[i] = dp[i - 1] + 1;

            if (i >= 2) {
                // Pair the last two characters
                int cost = (s.charAt(i - 2) == s.charAt(i - 1)) ? 1 : 0;

                dp[i] = Math.max(dp[i], dp[i - 2] + 4 - cost);
            }
        }

        return dp[n];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna