class Solution {
    public int countWords(String s) {
        // code here
        String str=s.trim();
        if(str.length()==0){
            return 0;
        }
        String[] st=str.split("\\s+");
        return st.length;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna