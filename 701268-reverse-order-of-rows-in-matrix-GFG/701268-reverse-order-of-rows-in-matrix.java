class Solution {
    void interchangeRows(int[][] mat) {
        // code here
        int n=mat.length;
        int start=0;
        int end=n-1;
        while(start<end){
            int[] temp=mat[start];
            mat[start]=mat[end];
            mat[end]=temp;
            start++;
            end--;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna