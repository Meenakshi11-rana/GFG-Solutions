class Solution {
    public int subsequenceSum(String s) {
        final int MOD = 1000000007;
        long ds = 0;
        int n = s.length();
        for (char ch : s.toCharArray())
            ds = (ds + ch - '0') % MOD;
        long df = 1;
        for (int i = 1; i < n; i++)
            df = (df * 2) % MOD;
        return (int)((ds * df) % MOD);
    }
}



// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna