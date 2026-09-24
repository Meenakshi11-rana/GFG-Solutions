class Solution:
    def maxStackHeight(self, r, h):
        n = len(r)

        # Store discs as (radius, height)
        discs = [(r[i], h[i]) for i in range(n)]

        # Sort by radius ascending, and height descending for equal radius
        discs.sort(key=lambda x: (x[0], -x[1]))

        # Coordinate compression of heights
        heights = sorted(set(h))
        m = len(heights)

        # Fenwick Tree for maximum DP value
        bit = [0] * (m + 1)

        def lower_bound(x):
            lo, hi = 0, m
            while lo < hi:
                mid = (lo + hi) // 2
                if heights[mid] < x:
                    lo = mid + 1
                else:
                    hi = mid
            return lo

        def query(index):
            result = 0
            while index > 0:
                result = max(result, bit[index])
                index -= index & -index
            return result

        def update(index, value):
            while index <= m:
                bit[index] = max(bit[index], value)
                index += index & -index

        answer = 0
        i = 0

        # Process equal-radius discs together
        # so discs with the same radius cannot be stacked
        while i < n:
            j = i

            while j < n and discs[j][0] == discs[i][0]:
                j += 1

            current_dp = []

            # Calculate DP values first
            for k in range(i, j):
                height = discs[k][1]

                pos = lower_bound(height)

                # Only strictly smaller heights are queried
                best = query(pos)

                dp = best + height
                current_dp.append(dp)
                answer = max(answer, dp)

            # Update Fenwick tree after processing this radius group
            for k in range(i, j):
                height = discs[k][1]
                pos = lower_bound(height) + 1
                update(pos, current_dp[k - i])

            i = j

        return answer

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna