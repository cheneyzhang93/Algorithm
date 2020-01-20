package algorithm;

/**
 * leetcode:https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/31/
 */
public class Rotate1 {

    public static void main(String[] args) {
        int[][] matrix = {
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };
        rotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "-");
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }
}
