package algorithm.everyday;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/rotting-oranges/
 */
public class OrangesRotting {

    public static void main(String[] args) {
        int[][] nums = new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        int[][] nums1 = new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};
        int[][] nums2 = new int[][]{{1, 2}};
        int[][] nums3 = new int[][]{{2, 1, 1}, {0, 1, 1}};
        int[][] nums4 = new int[][]{{1, 1, 2, 0, 2, 0}};
        int[][] nums5 = new int[][]{{1, 2, 1, 1, 2, 1, 1}};
//        System.out.println(orangesRotting(nums));
//        System.out.println(orangesRotting(nums1));
//        System.out.println(orangesRotting(nums2));
//        System.out.println(orangesRotting(nums3));
//        System.out.println(orangesRotting(nums4));
        System.out.println(orangesRotting(nums5));
    }

    static class Index {
        int x, y, minute;

        public Index(int x, int y, int minute) {
            this.x = x;
            this.y = y;
            this.minute = minute;
        }
    }

    public static int orangesRotting(int[][] grid) {
        if (grid.length == 0) return -1;
        int rowLen = grid.length;
        int colLen = grid[0].length;
        int minute = 0;
        int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        Queue<Index> queue = new LinkedList<>();

        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new Index(i, j, minute));
                }
            }
        }
        while (!queue.isEmpty()) {
            Index index = queue.poll();
            minute = index.minute;
            for (int i = 0; i < 4; i++) {
                int x = index.x + dir[i][0];
                int y = index.y + dir[i][1];
                if (x >= 0 && x < rowLen && y >= 0 && y < colLen && grid[x][y] == 1) {
                    grid[x][y] = 2;
                    queue.add(new Index(x, y, index.minute + 1));
                }
            }
        }
//        for (int[] value : grid) {
//            for (int v : value) {
//                System.out.print(v);
//            }
//            System.out.println();
//        }
        for (int[] value : grid) {
            for (int v : value) {
                if (v == 1) return -1;
            }
        }
        return minute;
    }
}
