class Solution {
    public int subarrayXor(int[] arr) {
        int n=arr.length;
       int xor=0;
       for(int i=0;i<n;i++){
        int freq=(((i-0)*(n-i))+(n-i)); 
        if(freq%2!=0)  
          xor^=arr[i];
       }
       return xor;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna