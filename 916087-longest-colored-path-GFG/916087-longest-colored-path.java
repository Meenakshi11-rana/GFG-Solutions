import java.util.*;

class Solution {
    public int longestPath(String s, int[][] edges) {
        int n = s.length();

        List<Integer>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            int u = edge[0] - 1;
            int v = edge[1] - 1;

            graph[u].add(v);
            graph[v].add(u);
        }

        // Build parent array and traversal order
        int[] parent = new int[n];
        Arrays.fill(parent, -1);

        int[] order = new int[n];
        int size = 0;

        order[size++] = 0;
        parent[0] = -2;

        for (int i = 0; i < size; i++) {
            int u = order[i];

            for (int v : graph[u]) {
                if (parent[v] == -1) {
                    parent[v] = u;
                    order[size++] = v;
                }
            }
        }

        // down[u] = longest same-color path starting at u
        // going towards its children
        int[] down = new int[n];

        int answer = 1;

        for (int i = n - 1; i >= 0; i--) {
            int u = order[i];

            down[u] = 1;

            for (int v : graph[u]) {
                if (parent[v] == u && s.charAt(v) == s.charAt(u)) {
                    down[u] = Math.max(down[u], 1 + down[v]);
                }
            }

            answer = Math.max(answer, down[u]);
        }

        // up[u] = longest same-color path from u through its parent
        int[] up = new int[n];
        up[0] = 1;

        for (int i = 1; i < n; i++) {
            int u = order[i];
            int p = parent[u];

            if (s.charAt(u) != s.charAt(p)) {
                up[u] = 1;
                continue;
            }

            int best = up[p];

            for (int v : graph[p]) {
                if (parent[v] == p &&
                    v != u &&
                    s.charAt(v) == s.charAt(p)) {

                    best = Math.max(best, down[v] + 1);
                }
            }

            up[u] = best + 1;
        }

        // Find longest same-color arm from every node
        int[] arm = new int[n];

        for (int u = 0; u < n; u++) {
            arm[u] = Math.max(down[u], up[u]);
            answer = Math.max(answer, arm[u]);
        }

        // Join an R part and a B part using one R-B edge
        for (int[] edge : edges) {
            int u = edge[0] - 1;
            int v = edge[1] - 1;

            if (s.charAt(u) != s.charAt(v)) {
                int length = arm[u] + arm[v];

                answer = Math.max(answer, length);
            }
        }

        return answer;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna