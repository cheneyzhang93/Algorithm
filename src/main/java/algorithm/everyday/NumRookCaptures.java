package algorithm.everyday;

/**
 * https://leetcode-cn.com/problems/available-captures-for-rook/
 */
public class NumRookCaptures {

    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', 'R', '.', '.', '.', 'p'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'}
        };
        char[][] board1 = new char[][]{
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', 'p', 'p', 'p', 'p', 'p', '.', '.'},
                {'.', 'p', 'p', 'B', 'p', 'p', '.', '.'},
                {'.', 'p', 'B', 'R', 'B', 'p', '.', '.'},
                {'.', 'p', 'p', 'B', 'p', 'p', '.', '.'},
                {'.', 'p', 'p', 'p', 'p', 'p', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'}
        };
        char[][] board2 = new char[][]{
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'p', 'p', '.', 'R', '.', 'p', 'B', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'B', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'}
        };

        System.out.println(numRookCaptures(board));
        System.out.println(numRookCaptures(board1));
        System.out.println(numRookCaptures(board2));
    }

    public static int numRookCaptures(char[][] board) {

        int count = 0;

        int ri = -1, rj = -1;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    ri = i;
                    rj = j;
                }
            }
        }

        if (ri == -1) return count;

        int tempri = ri, temprj = rj;
        while (--tempri >= 0) {
            if (board[tempri][temprj] == 'B') break;
            if (board[tempri][temprj] == 'p') {
                count++;
                break;
            }
        }
        tempri = ri;
        while (++tempri < 8) {
            if (board[tempri][temprj] == 'B') break;
            if (board[tempri][temprj] == 'p') {
                count++;
                break;
            }
        }
        tempri = ri;
        while (--temprj >= 0) {
            if (board[tempri][temprj] == 'B') break;
            if (board[tempri][temprj] == 'p') {
                count++;
                break;
            }
        }
        tempri = ri;
        temprj = rj;
        while (++temprj < 8) {
            if (board[tempri][temprj] == 'B') break;
            if (board[tempri][temprj] == 'p') {
                count++;
                break;
            }
        }

        return count;
    }

}
