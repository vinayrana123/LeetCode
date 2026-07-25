// class Solution {
//     public void setZeroes(int[][] matrix) {
//         int m = matrix.length;
//         int n  = matrix[0].length;
//       boolean[] rows = new boolean[matrix.length];
//       boolean[] cols = new boolean[matrix[0].length];
//       for(int row=0;row<matrix.length;row++){
//         for(int col = 0;col<matrix[0].length;col++){
//             if(matrix[row][col]==0){
//                 rows[row] = true;
//                 cols[col] = true;
//             }
            
//         }
//       }
//       for(int row=0;row<m;row++){
//         for(int col=0;col<n;col++){
//             if(rows[row] || cols[col]){
//                 matrix[row][col] = 0;
//             }
//         }
//       }
     
//     }
// }


//inplace algorithm code
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        // rows[] aur cols[] arrays hatane ke liye
        // sirf 1 extra variable chahiye (1st column ke liye)
        boolean col0 = false;

        // Pass 1: Identical to your logic, but marking matrix[row][0] & matrix[0][col]
        for (int row = 0; row < m; row++) {
            // Check agar 1st column me koi 0 hai
            if (matrix[row][0] == 0) {
                col0 = true;
            }

            for (int col = 1; col < n; col++) {
                if (matrix[row][col] == 0) {
                    matrix[row][0] = 0; // rows[row] = true ki jagah
                    matrix[0][col] = 0; // cols[col] = true ki jagah
                }
            }
        }

        // Pass 2: Values updated based on flags (Reverse loop to avoid overwriting 1st row early)
        for (int row = m - 1; row >= 0; row--) {
            for (int col = n - 1; col >= 1; col--) {
                if (matrix[row][0] == 0 || matrix[0][col] == 0) {
                    matrix[row][col] = 0;
                }
            }
            // Agar 1st column me zero tha, toh usko zero kar do
            if (col0) {
                matrix[row][0] = 0;
            }
        }
    }
}