import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {

        Deque<int[]> dq = new ArrayDeque<>();
        int ans = Integer.MIN_VALUE;

        for (int[] p : points) {
            int x = p[0];
            int y = p[1];

            // Remove points with distance > k
            while (!dq.isEmpty() && x - dq.peekFirst()[0] > k) {
                dq.pollFirst();
            }

            // Update answer
            if (!dq.isEmpty()) {
                ans = Math.max(ans, x + y + dq.peekFirst()[1]);
            }

            int value = y - x;

            // Maintain decreasing order of (y - x)
            while (!dq.isEmpty() && dq.peekLast()[1] <= value) {
                dq.pollLast();
            }

            dq.offerLast(new int[]{x, value});
        }

        return ans;
    }
}