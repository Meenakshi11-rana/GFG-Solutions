class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder ans = new StringBuilder();
        int balance = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {

                // If balance is 0, this is outermost '('
                if (balance > 0) {
                    ans.append(ch);
                }

                balance++;
            } 
            else {

                balance--;

                // If balance becomes 0, this was outermost ')'
                if (balance > 0) {
                    ans.append(ch);
                }
            }
        }

        return ans.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna