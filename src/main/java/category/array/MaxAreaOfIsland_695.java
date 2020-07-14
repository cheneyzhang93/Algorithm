package category.array;

import java.util.Stack;

/**
 * 695. 岛屿的最大面积
 * <p>
 * https://leetcode-cn.com/problems/max-area-of-island/
 */
public class MaxAreaOfIsland_695 {

    public static void main(String[] args) {
        System.out.println(maxAreaOfIsland(new int[][]{
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        }));
        System.out.println(maxAreaOfIsland(new int[][]{
                {1, 1},
                {1, 0}
        }));
        System.out.println(maxAreaOfIsland(new int[][]{
                {0, 0, 1}
        }));
    }

    public static int maxAreaOfIsland(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                count = Math.max(count, dfs(grid, i, j));
            }
        }
        return count;
//        return bfs(grid);
    }

    public static int dfs(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || (i == grid.length) || (j == grid[i].length) || (grid[i][j] != 1)) {
            return 0;
        }
        // 表达上下左右的坐标
        int[] x = {0, 0, -1, 1};
        int[] y = {-1, 1, 0, 0};
        // 已计算的点不再重复计算
        grid[i][j] = 0;
        int count = 1;
        for (int k = 0; k < 4; k++) {
            int ni = i + x[k], nj = j + y[k];
            count += dfs(grid, ni, nj);
        }
        return count;
    }

    public static int bfs(int[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int ccount = 0;

                Stack<Integer> stacki = new Stack<>();
                Stack<Integer> stackj = new Stack<>();

                stacki.push(i);
                stackj.push(j);

                while (!stacki.isEmpty()) {

                    int ci = stacki.pop(), cj = stackj.pop();

                    if (ci < 0 || cj < 0 || ci == grid.length || cj == grid[ci].length || grid[ci][cj] != 1) {
                        continue;
                    }

                    ccount++;
                    grid[ci][cj] = 0;

                    int[] x = {0, 0, -1, 1};
                    int[] y = {-1, 1, 0, 0};

                    for (int k = 0; k < 4; k++) {
                        int ni = ci + x[k], nj = cj + y[k];
                        stacki.push(ni);
                        stackj.push(nj);
                    }
                }
                count = Math.max(count, ccount);
            }

        }

        return count;
    }

}
