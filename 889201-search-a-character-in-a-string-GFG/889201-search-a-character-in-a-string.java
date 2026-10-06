class Solution {
    public int searchCharacter(String s, char c) {

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == c) {
                return i;
            }
        }

        return -1;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna