class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int srow = 0;
        int erow = m - 1;
        int scol = 0;
        int ecol = n - 1;

        ArrayList<Integer> ans = new ArrayList<>();

        while (srow <= erow && scol <= ecol) {

            // Top
            for (int j = scol; j <= ecol; j++) {
                ans.add(matrix[srow][j]);
            }

            // Right
            for (int i = srow + 1; i <= erow - 1; i++) {
                ans.add(matrix[i][ecol]);
            }

            // Bottom
            for (int j = ecol; j >= scol; j--) {
                if (srow == erow) break;
                ans.add(matrix[erow][j]);
            }

            // Left
            for (int i = erow - 1; i >= srow + 1; i--) {
                if (scol == ecol) break;
                ans.add(matrix[i][scol]);
            }

            srow++;
            erow--;
            scol++;
            ecol--;
        }

        return ans;
    }
}