import java.util.*;

class Solution {
    public ArrayList<Integer> update(int n, int[] updates) {
        int[] arr = new int[n];

        for (int j : updates) {
            arr[j - 1]++;
        }

        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int value : arr) {
            result.add(value);
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna