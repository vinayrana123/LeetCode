class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {

        int[][] directions = {
            {0, 1},   // East
            {1, 0},   // South
            {0, -1},  // West
            {-1, 0}   // North
        };

        List<int[]> result = new ArrayList<>();

        int steps = 0;   // how many steps to take
        int dir = 0;     // current direction

        result.add(new int[]{rStart, cStart});

        while (result.size() < rows * cols) {

            if (dir == 0 || dir == 2) {   // East or West
                steps++;
            }

            for (int count = 0; count < steps; count++) {

                rStart += directions[dir][0];
                cStart += directions[dir][1];

                // Valid cell
                if (rStart >= 0 && rStart < rows &&
                    cStart >= 0 && cStart < cols) {

                    result.add(new int[]{rStart, cStart});
                }
            }

            dir = (dir + 1) % 4;
        }

        int[][] ans = new int[rows * cols][2];

        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}