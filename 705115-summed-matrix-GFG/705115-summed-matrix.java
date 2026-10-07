class Solution {
    public int sumMatrix(int n, int q) {
        // code here
        // int count=0;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(i+j==q){
        //             count++;
        //         }
        //     }
        // }
        // return count;
        
        if(q<2||q>2*n){
            return 0;
        }
        if(q<=n+1){
            return q-1;
        }
        return 2*n-q+1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna