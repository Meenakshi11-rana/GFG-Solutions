class Solution {
    public String convertToCamelCase(String s) {

        String[] words = s.split("\\s+");

        StringBuilder sb = new StringBuilder();

        // First word
        sb.append(words[0]);

        // Remaining words
        for (int i = 1; i < words.length; i++) {


            sb.append(Character.toUpperCase(words[i].charAt(0)));
            sb.append(words[i].substring(1));
        }

        return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna