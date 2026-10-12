class Solution {
    public int maxPoint(int[] arr1, int[] arr2, int k) {
        int maxPoints = 0;

        for (int i = 0; i < arr1.length; i++) {
            int books = k / arr1[i];
            int points = books * arr2[i];

            maxPoints = Math.max(maxPoints, points);
        }

        return maxPoints;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna