package category.array;

import java.util.Arrays;

/**
 * 1051. 高度检查器
 * <p>
 * https://leetcode-cn.com/problems/height-checker/
 */
public class HeightChecker_1051 {

    public static void main(String[] args) {
        System.out.println(heightChecker(new int[]{1, 1, 4, 2, 1, 3}));
        System.out.println(heightChecker(new int[]{5, 1, 2, 3, 4}));
        System.out.println(heightChecker(new int[]{1, 2, 3, 4, 5}));
    }

    public static int heightChecker(int[] heights) {
        int count = 0;
        int[] sort = heights.clone();
        Arrays.sort(sort);

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sort[i]) {
                count++;
            }
        }

        return count;
    }
}
