import java.util.*;

class Solution {
    public int largestSumCycle(int[] edge) {
        int N = edge.length;
        boolean[] visited = new boolean[N];
        boolean[] pathVisited = new boolean[N];
        int maxCycleSum = -1;

        for (int i = 0; i < N; i++) {
            if (visited[i]) {
                continue;
            }

            int curr = i;
            List<Integer> path = new ArrayList<>();

            while (curr != -1 && !visited[curr]) {
                if (pathVisited[curr]) {
                    int currentCycleSum = 0;
                    int startIndex = path.indexOf(curr);

                    for (int j = startIndex; j < path.size(); j++) {
                        currentCycleSum += path.get(j);
                    }

                    maxCycleSum = Math.max(maxCycleSum, currentCycleSum);
                    break;
                }

                pathVisited[curr] = true;
                path.add(curr);
                curr = edge[curr];
            }

            for (int node : path) {
                pathVisited[node] = false;
                visited[node] = true;
            }
        }

        return maxCycleSum;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna