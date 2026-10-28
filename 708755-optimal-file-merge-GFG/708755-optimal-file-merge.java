import java.util.*;

class Solution {
    public int minComputation(int[] files) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int file : files) {
            pq.offer(file);
        }

        int totalCost = 0;

        while (pq.size() > 1) {
            int x = pq.poll();
            int y = pq.poll();

            int merged = x + y;
            totalCost += merged;

            pq.offer(merged);
        }

        return totalCost;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna