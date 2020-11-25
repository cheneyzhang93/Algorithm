package algorithm.other;

import java.util.Arrays;

public class Sudoku {

    public static void main(String[] args) {
        char[][] board = new char[][]{};
        backtrack(board, 0, 0);
        System.out.println(Arrays.asList(board));
    }


    public static void backtrack(char[][] board, int i, int j) {
//        int m = 9, n = 9;

        if (j == 9) {
            backtrack(board, i + 1, 0);
            return;
        }

        if (board[i][j] == '.') {
            backtrack(board, i, j + 1);
            return;
        }

        for (char ch = '1'; ch <= '9'; ch++) {
            if (!isValid(board, i, j, ch)) {
                continue;
            }
            board[i][j] = ch;
            backtrack(board, i, j + 1);
            board[i][j] = '.';
        }

    }

    public static boolean isValid(char[][] board, int row, int col, char n) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == n) {
                return false;
            }
            if (board[i][col] == n) {
                return false;
            }
            if (board[(row / 3) * 3 + i / 3][(col / 3) * 3 + i % 3] == n)
                return false;
        }
        return true;
    }

}
