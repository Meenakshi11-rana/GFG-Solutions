class Solution {
    public static int minTime(int n, int s1, int s2) {
        int low = 0;
        int high = n;
        int minTime = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Use long to prevent integer overflow during multiplication
            long time1 = (long) mid * s1;
            long time2 = (long) (n - mid) * s2;

            // Total time for the current distribution is the maximum of both
            long currentMaxTime = Math.max(time1, time2);
            minTime = (int) Math.min(minTime, currentMaxTime);

            // Adjust binary search bounds to balance the workload
            if (time1 <= time2) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return minTime;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna