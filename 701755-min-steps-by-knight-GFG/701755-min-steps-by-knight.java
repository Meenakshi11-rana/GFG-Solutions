import java.util.*;

class Solution {
    public int minStepToReachTarget(int[] knightPos, int[] targetPos, int n) {

        if (knightPos[0] == targetPos[0] &&
            knightPos[1] == targetPos[1]) {
            return 0;
        }

        int[][] moves = {
            {2, 1}, {2, -1},
            {-2, 1}, {-2, -1},
            {1, 2}, {1, -2},
            {-1, 2}, {-1, -2}
        };

        boolean[][] visited = new boolean[n + 1][n + 1];

        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{knightPos[0], knightPos[1], 0});
        visited[knightPos[0]][knightPos[1]] = true;

        while (!queue.isEmpty()) {

            int[] current = queue.poll();

            int x = current[0];
            int y = current[1];
            int steps = current[2];

            for (int[] move : moves) {

                int nx = x + move[0];
                int ny = y + move[1];

                if (nx >= 1 && nx <= n &&
                    ny >= 1 && ny <= n &&
                    !visited[nx][ny]) {

                    if (nx == targetPos[0] && ny == targetPos[1]) {
                        return steps + 1;
                    }

                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx, ny, steps + 1});
                }
            }
        }

        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna