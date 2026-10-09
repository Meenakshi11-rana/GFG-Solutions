class Solution {
    public int[] countOddEven(int[] arr) {
        int odd = 0;
        int even = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                odd++;
            } else {
                even++;
            }
        }

        return new int[]{odd, even};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna