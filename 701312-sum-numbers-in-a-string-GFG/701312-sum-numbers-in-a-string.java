class Solution {
    public int findSum(String s) {

        int sum = 0;
        int num = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c >= '0' && c <= '9') {
                num = num * 10 + (c - '0');
            } else {
                sum += num;
                num = 0;
            }
        }

        // Add the last number
        sum += num;

        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna