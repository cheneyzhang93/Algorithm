package algorithm.other;

import java.util.ArrayList;
import java.util.List;

public class NQueen {

    static List<List<List<String>>> res = new ArrayList<>();

    public static void main(String[] args) {
        queen(4);
//        System.out.println(res);
    }

    public static void queen(int n) {
        List<List<String>> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<String> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(".");
            }
            board.add(row);
        }

        backtrack(board, 0);
    }

    public static void backtrack(List<List<String>> board, int row) {
        if (row == board.size()) {
            res.add(new ArrayList<>(board));
            return;
        }

        int n = board.get(row).size();
        for (int col = 0; col < n; col++) {
            if (!isValid(board, row, col)) {
                continue;
            }
            board.get(row).set(col, "Q");
            backtrack(board, row + 1);
            board.get(row).set(col, ".");
        }
    }

    public static boolean isValid(List<List<String>> board, int row, int col) {
        int n = board.get(row).size();
        // 行
        for (int i = 0; i < n; i++) {
            if (board.get(row).get(i).equals("Q")) {
                return false;
            }
        }
        // 列
        for (int i = 0; i < n; i++) {
            if (board.get(i).get(col).equals("Q")) {
                return false;
            }
        }
        // 左上
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board.get(i).get(j).equals("Q")) {
                return false;
            }
        }
        // 右上
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board.get(i).get(j).equals("Q")) {
                return false;
            }
        }
        return true;
    }


}
