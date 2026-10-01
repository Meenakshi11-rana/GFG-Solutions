import java.util.*;

class Solution {

    public int minTime(int[] duration, int[][] dependencies) {

        int n = duration.length;

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        int[] indegree = new int[n];

        // Build graph
        for (int[] edge : dependencies) {
            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);
            indegree[v]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        int[] finishTime = new int[n];

        // Modules with no dependencies
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
                finishTime[i] = duration[i];
            }
        }

        int count = 0;
        int answer = 0;

        while (!queue.isEmpty()) {

            int u = queue.poll();
            count++;

            answer = Math.max(answer, finishTime[u]);

            for (int v : graph.get(u)) {

                finishTime[v] = Math.max(
                    finishTime[v],
                    finishTime[u] + duration[v]
                );

                indegree[v]--;

                if (indegree[v] == 0) {
                    queue.offer(v);
                }
            }
        }

        // If not all modules were processed, there is a cycle
        if (count != n) {
            return -1;
        }

        return answer;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna