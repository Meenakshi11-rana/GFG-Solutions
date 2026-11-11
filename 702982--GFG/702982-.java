class Solution {
    public boolean checkWithinK(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<arr.length;i++) {
            if(map.containsKey(arr[i])) {
                if(i-map.get(arr[i]) <= k) {
                    return true;
                }
            } 
            map.put(arr[i],i);
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna