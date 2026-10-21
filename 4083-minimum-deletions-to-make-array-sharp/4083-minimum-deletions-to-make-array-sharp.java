class Solution {
    public int minDeletions(int[] nums) {
        int deletions = 0;
        int prev = -1;
        boolean hasPrev = false;

        for (int num : nums) {
            if (hasPrev && num == prev) {
                deletions++;
            } else {
                prev = num;
                hasPrev = true;
            }
        }

        return deletions;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna