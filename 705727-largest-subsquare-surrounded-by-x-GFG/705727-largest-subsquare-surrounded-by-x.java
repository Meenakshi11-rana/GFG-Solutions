class Solution {
    static int largestSubsquare(char[][] mat) {
        int n = mat.length;

        int[][] right = new int[n][n];
        int[][] down = new int[n][n];

        // Count consecutive X towards right and down
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (mat[i][j] == 'X') {
                    right[i][j] = 1;
                    down[i][j] = 1;

                    if (j + 1 < n)
                        right[i][j] += right[i][j + 1];

                    if (i + 1 < n)
                        down[i][j] += down[i + 1][j];
                }
            }
        }

        int maxSize = 0;

        // Try every cell as the top-left corner
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                int possible = Math.min(right[i][j], down[i][j]);

                while (possible > maxSize) {
                    int bottom = i + possible - 1;
                    int rightCol = j + possible - 1;

                    if (bottom < n && rightCol < n &&
                        down[i][rightCol] >= possible &&
                        right[bottom][j] >= possible) {

                        maxSize = possible;
                        break;
                    }

                    possible--;
                }
            }
        }

        return maxSize;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna