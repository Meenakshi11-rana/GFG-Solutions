class Solution {
    static int decimalEquivalent(String n, int b) {
        int result = 0;

        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);

            int digit;

            if (ch >= '0' && ch <= '9') {
                digit = ch - '0';
            } else {
                digit = ch - 'A' + 10;
            }

            result = result * b + digit;
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna