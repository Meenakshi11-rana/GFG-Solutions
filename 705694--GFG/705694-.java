
import java.util.*;
class Solution {
    public char posInfinite(String s, int pos) {
        // code here

        long len = s.length();
                long target = pos;
                long step = 0;

                // Step 1: Expand length until it reaches or exceeds pos, tracking the step count
                while (len < target) {
                    step++;
                    len = len * 2 + step;
                }

                // Step 2: Fold target back step-by-step into the original string
                while (target > s.length()) {
                    long prevLen = (len - step) / 2;

                    // Check if target falls inside the middle block of 'step' '$' characters
                    if (target > prevLen && target <= prevLen + step) {
                        return '$';
                    } 
                    // Check if target falls in the reversed right half
                    else if (target > prevLen + step) {
                        target = len - target + 1;
                    }

                    len = prevLen;
                    step--;
                }

                // Step 3: Return the 0-indexed character from the original string
                return s.charAt((int) (target - 1));
    }
}



// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna