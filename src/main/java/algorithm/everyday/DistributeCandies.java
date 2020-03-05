package algorithm.everyday;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/distribute-candies-to-people/
 */
public class DistributeCandies {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(distributeCandies(10, 2)));
//        System.out.println(Arrays.toString(distributeCandies(10, 3)));
    }

    public static int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int count = 1;
        for (int j = 0; j < res.length; ) {
            res[j] += Math.min(count, candies);
            candies -= count++;
            if (candies <= 0) candies = 0;
            if (candies > 0 && j == res.length - 1) {
                j = 0;
                continue;
            }
            j++;
        }
        return res;
    }

}
