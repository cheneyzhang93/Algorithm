package algorithm.dp;

/**
 * https://leetcode-cn.com/problems/unique-paths-ii/
 */
public class UniquePathsWithObstacles {

    public static void main(String[] args) {
        int[][] nums = new int[][]{
                {0, 0, 0}
        };
        System.out.println(uniquePathsWithObstacles(nums));
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    res[i][j] = 0;
                } else if ((i == 0 && j == 0)) {
                    res[i][j] = 1;
                } else if (i == 0) {
                    res[i][j] = res[i][j - 1];
                } else if (j == 0) {
                    res[i][j] = res[i - 1][j];
                } else {
                    res[i][j] = res[i - 1][j] + res[i][j - 1];
                }
            }
        }
        return res[m - 1][n - 1];
    }
}
