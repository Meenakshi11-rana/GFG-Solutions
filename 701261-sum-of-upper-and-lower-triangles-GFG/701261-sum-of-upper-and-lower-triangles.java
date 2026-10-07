import java.util.*;

class Solution {
    public ArrayList<Integer> sumTriangles(int[][] mat) {

        int n = mat.length;

        int upper = 0;
        int lower = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // Upper triangle
                if (j >= i) {
                    upper += mat[i][j];
                }

                // Lower triangle
                if (j <= i) {
                    lower += mat[i][j];
                }
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(upper);
        ans.add(lower);

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna