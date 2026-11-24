class Solution {
    public int maxLength(int[] nums) {
        //brute force
        int max = 1;
        int n = nums.length;
        for(int i = 0;i<n-1;i++){
            int pro = nums[i];
            int lcm = nums[i];
            int gcd = nums[i];
            for(int j = i+1;j<n;j++){
                pro *= nums[j];
                lcm = Lcm(lcm,nums[j]);
                gcd = Gcd(gcd,nums[j]);
                if(pro == lcm * gcd){
                    max = Math.max(max,j - i + 1);
                }else{
                    break;//not really necessary.
                }
            }
        }
        return max;
    }
     public static int Lcm(int a,int b) {
        return Math.abs((a / Gcd(a, b)) * b);
    }
    public static int Gcd(int a,int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna