class Solution {
    public int convertFive(int n) {
        // code here
        if(n==0){
            return 5;
        }
        int result=0;
        int place=1;
        
        while(n>0){
            int digit= n%10;
            if(digit==0){
                digit=5;
            }
            
            result=result+digit*place;
            place=place*10;
            n=n/10;
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna