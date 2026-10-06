class Solution {
    public String reverseString(String s) {

        String ans = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            ans = ans + s.charAt(i);
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna