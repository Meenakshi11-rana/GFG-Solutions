class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        // BRUTE FORCE- O(N^3)
        // int n=arr.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         for(int k=j+1;k<n;k++){
        //             if((arr[i]+arr[j]+arr[k]==target)){
        //                 return true;
        //             }
        //         }
        //     }
        // }
        // return false;
        
        //APPROACH 2
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            
        while (left < right) {
                        long sum = (long) arr[i] + arr[left] + arr[right];

                        if (sum == target) {
                            return true;
                        } else if (sum < target) {
                            left++;
                        } else {
                            right--;
                        }
                    }
                }    
                return false;
        }
    }



// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna