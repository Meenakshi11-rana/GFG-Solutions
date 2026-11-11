class Solution {
    static int minDiff(Node root, int K) {
        if(root==null) return Integer.MAX_VALUE;
        int diff=Math.abs(root.data-K);
        if(K<root.data){
            return Math.min(diff,minDiff(root.left,K));
        }
        else if(K>root.data){
            return Math.min(diff,minDiff(root.right,K));
        }
        else{
            return 0;
        }

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna