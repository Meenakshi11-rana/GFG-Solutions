import java.util.Collections;

class Solution {
    public long maximumSubarray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        // Initialize states with the first element
        long dp0 = arr[0];
        long dp1 = (long) arr[0] * arr[0];
        long maxSum = Math.max(dp0, dp1);

        for (int i = 1; i < arr.length; i++) {
            long x = arr[i];
            long sqX = x * x;

            // Calculate new states based on the previous states
            long nextDp1 = Math.max(sqX, Math.max(dp0 + sqX, dp1 + x));
            long nextDp0 = Math.max(x, dp0 + x);

            dp0 = nextDp0;
            dp1 = nextDp1;

            // Update the global maximum sum found so far
            maxSum = Math.max(maxSum, Math.max(dp0, dp1));
        }

        return maxSum;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna