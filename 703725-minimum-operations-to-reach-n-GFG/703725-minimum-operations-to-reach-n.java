class Solution {
    static int minOperation(int n) {
        int operations = 0;

        while (n > 0) {
            if (n % 2 == 1) {
                operations++;
                n--;
            } else {
                n /= 2;
                operations++;
            }
        }

        return operations;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna