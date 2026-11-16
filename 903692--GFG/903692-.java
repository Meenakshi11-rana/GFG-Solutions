
class Solution {
    public int findKthSmall(int[] arr, int k) {

        Arrays.sort(arr);
        int i,cnt=0;
        for( i=0;i<arr.length;i++){
            if(arr[i]!=i+1) cnt=(arr[i]-i-1);
            if(cnt>=k) return i+k;
        }
        return arr.length+k;
    }
}



// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna