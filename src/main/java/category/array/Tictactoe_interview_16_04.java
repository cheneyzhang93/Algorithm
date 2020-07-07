package category.array;

/**
 * 面试题 16.04. 井字游戏
 * <p>
 * https://leetcode-cn.com/problems/tic-tac-toe-lcci/
 */
public class Tictactoe_interview_16_04 {

    public static void main(String[] args) {
        System.out.println(tictactoe(new String[]{"O X", " XO", "X O"}));
        System.out.println(tictactoe(new String[]{"OOX", "XXO", "OXO"}));
        System.out.println(tictactoe(new String[]{"OOX", "XXO", "OX "}));
        System.out.println(tictactoe(new String[]{"OXX", "O X", "OX "}));
    }

    public static String tictactoe(String[] board) {

        int winX = board.length * 'X';
        int winO = board.length * 'O';
        boolean space = false;

        char[][] boards = new char[board.length][board.length];
        for (int i = 0; i < board.length; i++) {
            char[] bs = board[i].toCharArray();
            System.arraycopy(bs, 0, boards[i], 0, board.length);
        }

        int temp3 = 0, temp4 = 0;
        for (int i = 0; i < board.length; i++) {
            int temp1 = 0, temp2 = 0;
            for (int j = 0; j < board.length; j++) {
                temp1 += boards[i][j];
                temp2 += boards[j][i];
                if (boards[i][j] == ' ') {
                    space = true;
                }
            }
            temp3 += boards[i][i];
            temp4 += boards[i][board.length - 1 - i];
            if (temp1 == winX || temp2 == winX || temp3 == winX || temp4 == winX) {
                return "X";
            }
            if (temp1 == winO || temp2 == winO || temp3 == winO || temp4 == winO) {
                return "O";
            }

        }

        if (space) {
            return "Pending";
        }

        return "Draw";
    }
}
