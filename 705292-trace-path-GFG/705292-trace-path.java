class Solution {
    public boolean isPossible(int n, int m, String s) {
        int row = 0, col = 0;
        int minRow = 0, maxRow = 0;
        int minCol = 0, maxCol = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'L') col--;
            else if (ch == 'R') col++;
            else if (ch == 'D') row--;
            else if (ch == 'U') row++;

            minRow = Math.min(minRow, row);
            maxRow = Math.max(maxRow, row);
            minCol = Math.min(minCol, col);
            maxCol = Math.max(maxCol, col);
        }

        return (maxRow - minRow < n) && (maxCol - minCol < m);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna