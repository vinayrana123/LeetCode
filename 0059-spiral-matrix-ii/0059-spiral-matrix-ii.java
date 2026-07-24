class Solution {
    public int[][] generateMatrix(int n) {
       int [][] Matrix = new int[n][n];
        int num = 1;
        int srow = 0;
        int erow = n - 1;
        int scol = 0;
        int ecol = n - 1;

        

        while (srow <= erow && scol <= ecol) {

            // Top
            for (int j = scol; j <= ecol; j++) {
                Matrix[srow][j] = num++;
            }

            // Right
            for (int i = srow + 1; i <= erow - 1; i++) {
                Matrix[i][ecol] = num++;
            }

            // Bottom
            for (int j = ecol; j >= scol; j--) {
                if (srow == erow) break;
                Matrix[erow][j] = num++;
            }

            // Left
            for (int i = erow - 1; i >= srow + 1; i--) {
                if (scol == ecol) break;
               Matrix[i][scol] = num++;
            }

            srow++;
            erow--;
            scol++;
            ecol--;
        }

        return Matrix;
    }
}
   