package algorithm.everyday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof/
 */
public class FindContinuousSequence {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(findContinuousSequence(9)));
    }

    public static int[][] findContinuousSequence(int target) {

        if (target == 0) return new int[][]{{0}};
        if (target == 1) return new int[][]{{1}};
        if (target == 2) return new int[][]{{2}};

        List<List<Integer>> resTemp = new ArrayList<>();
        for (int i = 1; i < target; i++) {
            int r = i + 1;
            List<Integer> temp = new ArrayList<>();
            temp.add(i);
            int sum = i;
            while (i < r) {
                temp.add(r);
                sum += r;
                if (sum == target) {
                    resTemp.add(temp);
                    break;
                }
                if (sum > target) break;
                r++;
            }
        }

        int[][] res = new int[resTemp.size()][];
        for (int i = 0; i < resTemp.size(); i++) {
            int len = resTemp.get(i).size();
            int[] r = new int[len];
            for (int j = 0; j < len; j++) {
                r[j] = resTemp.get(i).get(j);
            }
            res[i] = r;
        }

        return res;
    }
}
