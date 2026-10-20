import java.util.*;

class Solution {
    public ArrayList<Integer> lexicographicallyLargest(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; ) {
            int j = i;

            // Find a contiguous group of elements with the same parity
            while (j + 1 < n && arr[j] % 2 == arr[j + 1] % 2) {
                j++;
            }

            // Sort this group in descending order
            Arrays.sort(arr, i, j + 1);

            for (int left = i, right = j; left < right; left++, right--) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }

            i = j + 1;
        }

        for (int x : arr) {
            result.add(x);
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna