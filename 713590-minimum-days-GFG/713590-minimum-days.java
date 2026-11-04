class Solution {
    public static int getMinimumDays(String s, int[] p) {
        int n = s.length();
        char[] str = s.toCharArray();
        int duplicatePairs = 0;

        // Step 1: Count initial adjacent identical pairs
        for (int i = 0; i < n - 1; i++) {
            if (str[i] == str[i + 1]) {
                duplicatePairs++;
            }
        }

        // If there are no adjacent identical characters initially, 0 days are needed
        if (duplicatePairs == 0) {
            return 0;
        }

        // Step 2: Simulate the process day by day
        for (int day = 0; day < n; day++) {
            int idx = p[day];

            // Check if the character at idx matches its left neighbor
            if (idx > 0 && str[idx] != '?' && str[idx] == str[idx - 1]) {
                duplicatePairs--;
            }

            // Check if the character at idx matches its right neighbor
            if (idx < n - 1 && str[idx] != '?' && str[idx] == str[idx + 1]) {
                duplicatePairs--;
            }

            // Mark the character as processed/replaced
            str[idx] = '?';

            // If all duplicate adjacent pairs are eliminated, return the number of days (1-indexed)
            if (duplicatePairs == 0) {
                return day + 1;
            }
        }

        return n;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna