class Solution {

    public void solveSudoku(char[][] board) {
        solve(board);
    }

    static boolean solve(char[][] board) {

        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;

        // Find the first empty cell
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }

            if (!emptyLeft) {
                break;
            }
        }

        // Sudoku solved
        if (emptyLeft) {
            return true;
        }

        // Try numbers 1 to 9
        for (char num = '1'; num <= '9'; num++) {

            if (isSafe(board, row, col, num)) {

                board[row][col] = num;

                if (solve(board)) {
                    return true;
                } else {
                    board[row][col] = '.';
                }
            }
        }

        return false;
    }

    static boolean isSafe(char[][] board, int row, int col, char num) {

        // Check row
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        // Check column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        // Check 3x3 box
        int rowStart = row - row % 3;
        int colStart = col - col % 3;

        for (int r = rowStart; r < rowStart + 3; r++) {
            for (int c = colStart; c < colStart + 3; c++) {
                if (board[r][c] == num) {
                    return false;
                }
            }
        }

        return true;
    }
}