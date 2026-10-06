class Solution {
    public char getMaxOccuringChar(String s) {

        int[] count = new int[26];

        // Count frequency
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        int max = 0;
        char answer = 'z';

        // Find maximum frequency
        // If frequency is same, smaller character wins
        for (int i = 0; i < 26; i++) {

            if (count[i] > max) {
                max = count[i];
                answer = (char)('a' + i);
            }
        }

        return answer;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna