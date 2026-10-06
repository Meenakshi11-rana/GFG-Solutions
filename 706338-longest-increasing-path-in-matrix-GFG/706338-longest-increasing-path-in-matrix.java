class Solution {

    int n, m;
    int[][] dp;

    int[] dr = {-1, 1, 0, 0};
    int[] dc = {0, 0, -1, 1};

    public int longIncPath(int[][] mat, int n, int m) {
        this.n = n;
        this.m = m;

        dp = new int[n][m];

        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans = Math.max(ans, dfs(mat, i, j));
            }
        }

        return ans;
    }

    private int dfs(int[][] mat, int r, int c) {

        if (dp[r][c] != 0) {
            return dp[r][c];
        }

        int best = 1;

        for (int k = 0; k < 4; k++) {

            int nr = r + dr[k];
            int nc = c + dc[k];

            if (nr >= 0 && nr < n &&
                nc >= 0 && nc < m &&
                mat[nr][nc] > mat[r][c]) {

                best = Math.max(best, 1 + dfs(mat, nr, nc));
            }
        }

        dp[r][c] = best;

        return best;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna