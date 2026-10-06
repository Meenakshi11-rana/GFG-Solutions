import java.util.*;

class Solution {
    public ArrayList<String> palindromicSubstr(String s) {

        HashSet<String> set = new HashSet<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {

            // Odd length palindromes
            int l = i, r = i;

            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                set.add(s.substring(l, r + 1));
                l--;
                r++;
            }

            // Even length palindromes
            l = i;
            r = i + 1;

            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                set.add(s.substring(l, r + 1));
                l--;
                r++;
            }
        }

        ArrayList<String> ans = new ArrayList<>(set);
        Collections.sort(ans);

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna